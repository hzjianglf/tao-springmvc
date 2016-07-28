package com.wsp.tao.springmvc.shiro;

import com.wsp.tao.springmvc.entity.SysRole;
import com.wsp.tao.springmvc.entity.SysUser;
import com.wsp.tao.springmvc.service.SysUserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@Service
@Transactional
public class AuthoRealm extends AuthorizingRealm {

    @Autowired
    private SysUserService sysUserService;

    private SysUser currentUser;
    /**
     * 权限认证
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        //获取登录时输入的用户名
        String loginName=(String) principalCollection.fromRealm(getName()).iterator().next();
        //到数据库查是否有此对象
        SysUser user=sysUserService.findByName(loginName);
        if(user!=null){
            //权限信息对象info,用来存放查出的用户的所有的角色（role）及权限（permission）
            SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
            //用户的角色集合
            info.addRoles(user.getRoles());
            //用户的角色对应的所有权限，如果只使用角色定义访问权限，下面的四行可以不要
            info.addStringPermissions(user.getPermission());
            return info;
        }
        return null;
    }

    /**
     * 登录认证;
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
            //UsernamePasswordToken对象用来存放提交的登录信息
            UsernamePasswordToken token=(UsernamePasswordToken) authenticationToken;
            //查出是否有此用户
        currentUser=sysUserService.findByName(token.getUsername());
            if(currentUser!=null){
                //若存在，将此用户存放到登录认证info中
                return new SimpleAuthenticationInfo(currentUser.getUsername(), currentUser.getPassword(), getName());
            }
            return null;
    }

    @Override
    protected void assertCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) throws AuthenticationException {
        try {
            super.assertCredentialsMatch(token, info);
            Subject sub = SecurityUtils.getSubject();
            if (currentUser == null) {
                return;
            }
            sub.getSession().setAttribute("currentUserId", currentUser.getId());
            sub.getSession().setAttribute("currentUsername",currentUser.getUsername());
            sub.getSession().setAttribute("currentRealName",currentUser.getRealName());
        } catch (AuthenticationException ex) {
            throw ex;
        }
    }
}

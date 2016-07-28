package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.common.utils.Collections3;
import com.wsp.tao.springmvc.dao.SysUserDao;
import com.wsp.tao.springmvc.entity.SysUser;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@Repository("sysUserDao")
public class SysUserDaoImpl extends BaseDaoImpl<SysUser,Integer> implements SysUserDao{


    @Override
    public SysUser findByName(String userName){
        SysUser sysUser =null;
        List<SysUser> sysUserList = super.createQuery(" from SysUser where username = '" + userName+"'");
        if(Collections3.isNotEmpty(sysUserList)){
            sysUser = sysUserList.get(0);
        }
        return sysUser;
    };

}

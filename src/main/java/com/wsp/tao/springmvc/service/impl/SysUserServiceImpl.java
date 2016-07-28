package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.dao.OrderDao;
import com.wsp.tao.springmvc.dao.SysUserDao;
import com.wsp.tao.springmvc.entity.MemberEntity;
import com.wsp.tao.springmvc.entity.SysUser;
import com.wsp.tao.springmvc.service.MemberService;
import com.wsp.tao.springmvc.service.SysUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@Service("sysUserService")
public class SysUserServiceImpl extends BaseServiceImpl<SysUser,Integer> implements SysUserService {

    @Resource(name = "sysUserDao")
    public void setBaseDao(SysUserDao sysUserDao) {
        super.setBaseDao(sysUserDao);
    }

}

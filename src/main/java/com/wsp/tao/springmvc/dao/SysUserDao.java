package com.wsp.tao.springmvc.dao;

import com.wsp.tao.springmvc.entity.SysUser;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
public interface SysUserDao extends BaseDao<SysUser,Integer> {
    public SysUser findByName(String userName);
}

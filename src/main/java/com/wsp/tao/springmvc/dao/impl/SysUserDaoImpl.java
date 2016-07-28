package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.dao.SysUserDao;
import com.wsp.tao.springmvc.entity.SysUser;
import org.springframework.stereotype.Repository;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@Repository("sysUserDao")
public class SysUserDaoImpl extends BaseDaoImpl<SysUser,Integer> implements SysUserDao{

}

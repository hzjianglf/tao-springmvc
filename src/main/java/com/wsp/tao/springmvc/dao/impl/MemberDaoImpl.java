package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.dao.MemberDao;
import com.wsp.tao.springmvc.entity.MemberEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Repository("memberDao")
public class MemberDaoImpl extends BaseDaoImpl<MemberEntity,Long> implements MemberDao {

}

package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.dao.MemberDao;
import com.wsp.tao.springmvc.entity.MemberEntity;
import com.wsp.tao.springmvc.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Service("memberService")
public class MemberServiceImpl extends BaseServiceImpl<MemberEntity,Long> implements MemberService {

    @Resource(name = "memberDao")
    public void setBaseDao(MemberDao memberDao) {
        super.setBaseDao(memberDao);
    }


    @Override
    public MemberEntity find(Long aLong) {
        return super.find(aLong);
    }

    @Override
    @Transactional
    public void save(MemberEntity member) {
        super.save(member);
    }

    @Override
    public MemberEntity merge(MemberEntity entity) {
        return null;
    }

    @Override
    public void remove(MemberEntity entity) {

    }

    @Override
    public void refresh(MemberEntity entity) {

    }


}

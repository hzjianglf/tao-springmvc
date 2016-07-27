package com.wsp.tao.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.wsp.tao.springmvc.common.utils.PageUtil;
import com.wsp.tao.springmvc.entity.MemberEntity;
import com.wsp.tao.springmvc.entity.QueryResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;


/**
 * Created by wangshupeng1 on 2016/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
        "classpath:spring-hibernate.xml" })
public class TestMemberService {
    //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(TestMemberService.class);

    @Autowired
    private MemberService memberService;

    @Test
    public void save() {
        MemberEntity member = new MemberEntity();
        member.setName("王树鹏");
        member.setAddress("北京市朝阳区1");
        member.setCreateDate(new Date());
        memberService.save(member);
        logger.info(JSON.toJSONString(222));
    }

    @Test
    public void delete() {
        MemberEntity member = new MemberEntity();
        member.setId(1L);
        memberService.remove(member);
        logger.info(JSON.toJSONString(222));
    }

    @Test
    public void update() {
        MemberEntity member = new MemberEntity();
        member.setId(2L);
        member.setAddress("京东金融");
        memberService.update(member);
        logger.info(JSON.toJSONString(222));
    }

    @Test
    public void find() {
        MemberEntity entity =  memberService.find(2L);
        entity.getOrders().get(0).getAddress();
        System.out.print(entity.getCreateDate());
        logger.info(JSON.toJSONString(entity));
    }

    @Test
    public void createQuery() {
        List<MemberEntity> memberList = memberService.createQuery("from MemberEntity ");
        logger.info(JSON.toJSONString(memberList));
    }

    @Test
    public void createSqlQuery() {
        List<MemberEntity> memberList = memberService.createSqlQuery("select * from tao_member");
        logger.info(JSON.toJSONString(memberList));
    }

    @Test
    public void queryPages() {

        PageUtil pageUtil = new PageUtil();
        pageUtil.setPageNow(1);
        pageUtil.setPageSize(3);
        pageUtil.setModelName("MemberEntity");
        QueryResult<MemberEntity> pageList = memberService.queryPages(pageUtil);
        List<MemberEntity> memberList = pageList.getResultList();
        logger.info(JSON.toJSONString(pageList));
    }
}

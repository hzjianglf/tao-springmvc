package com.wsp.tao.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.wsp.tao.springmvc.entity.MemberEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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
        member.setName("利丰贾1");
        member.setAddress("a");
        memberService.save(member);
        logger.info(JSON.toJSONString(222));
    }
}

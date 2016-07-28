package com.wsp.tao.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.wsp.tao.springmvc.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
        "classpath:spring-hibernate.xml" })
public class TestUserService {
        private final static Logger logger = LoggerFactory.getLogger(TestUserService.class);

        @Autowired
        private SysUserService sysUserService;

        @Test
        public void find() {
                SysUser user =  sysUserService.find(1);
                user.getRoleList();
                logger.info("user res:{}", JSON.toJSON(user));
        }

}

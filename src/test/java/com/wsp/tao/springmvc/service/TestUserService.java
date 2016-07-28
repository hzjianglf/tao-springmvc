package com.wsp.tao.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.wsp.tao.springmvc.common.utils.GsonUtil;
import com.wsp.tao.springmvc.common.utils.PageUtil;
import com.wsp.tao.springmvc.entity.OrderEntity;
import com.wsp.tao.springmvc.entity.OrderItemEntity;
import com.wsp.tao.springmvc.entity.QueryResult;
import com.wsp.tao.springmvc.entity.SysUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

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
                user.getRoles();
                user.getPermission();
                logger.info("user res:{}", JSON.toJSON(user));
        }

        @Test
        public void findByUserName() {
                String username = "admin";
                SysUser sysUserResult = sysUserService.findByName(username);
                logger.info("user res:{}", GsonUtil.toJson(sysUserResult));
        }

        public static void main(String[] args) {
                TestEntity test = new TestEntity();
                test.setName("王树鹏");
                logger.info("user res:{}", GsonUtil.toJson(test));
        }

        @Test
        public void queryPages() {

                PageUtil pageUtil = new PageUtil();
                pageUtil.setPageNow(1);
                pageUtil.setPageSize(2);
                pageUtil.setModelName("SysUser");
                QueryResult<SysUser> pageList = sysUserService.queryPages(pageUtil);
                List<SysUser> orderList = pageList.getResultList();
                logger.info(JSON.toJSONString(orderList));
        }

}

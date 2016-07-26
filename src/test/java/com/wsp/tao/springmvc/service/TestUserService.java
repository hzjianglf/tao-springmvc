package com.wsp.tao.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.wsp.tao.springmvc.dao.PersonDao;
import com.wsp.tao.springmvc.entity.PersonEntity;
import com.wsp.tao.springmvc.service.PersonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * Created by wangshupeng1 on 2016/7/24.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml",
        "classpath:spring-hibernate.xml" })
public class TestUserService {
    //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(TestUserService.class);

    @Autowired
    private PersonService personService;

    @Autowired
    private PersonDao personDao;

    @Test
    public void save() {
        PersonEntity person = new PersonEntity();
        person.setName("王树鹏6");
        person.setAddress("长安街");
        person.setAge(11L);
        person.setApplicantId("3");
        person.setId(UUID.randomUUID().toString());
        person.setCreateTime(new Timestamp(new Date().getTime()));
        String id = personService.save(person);
        logger.info(JSON.toJSONString(id));
    }

//    @Test
//    public void saveDao() {
//        PersonEntity person = new PersonEntity();
//        person.setName("王树鹏2");
//        person.setAddress("长安街");
//        person.setAge(11L);
//        person.setApplicantId("3");
//        person.setId(UUID.randomUUID().toString());
//        person.setCreateTime(new Timestamp(new Date().getTime()));
//        String id = personDao.save(person);
//        logger.info(JSON.toJSONString(id));
//    }



    public static void main(String[] args) {
        System.out.print(UUID.randomUUID().toString().length());
        for(int i = 0 ; i < 10 ; i ++){
            logger.info("打印日志测试info:{}--{}",i,i);
            logger.error("打印日志测试error:{}--{}",i,i);
            logger.debug("打印日志测试debug:{}--{}",i,i);
        }
    }
}

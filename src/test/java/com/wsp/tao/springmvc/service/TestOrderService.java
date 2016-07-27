package com.wsp.tao.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.wsp.tao.springmvc.common.utils.PageUtil;
import com.wsp.tao.springmvc.entity.MemberEntity;
import com.wsp.tao.springmvc.entity.OrderEntity;
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
public class TestOrderService {
    //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(TestOrderService.class);

    @Autowired
    private OrderService orderService;

    @Test
    public void save() {
        OrderEntity order = new OrderEntity();
        order.setCreateDate(new Date());
        order.setModifyDate(new Date());
        order.setAddress("我的订单地址");
        orderService.save(order);
        logger.info(JSON.toJSONString(order));
    }

    @Test
    public void queryPages() {

        PageUtil pageUtil = new PageUtil();
        pageUtil.setPageNow(1);
        pageUtil.setPageSize(2);
        pageUtil.setModelName("OrderEntity");
        QueryResult<OrderEntity> pageList = orderService.queryPages(pageUtil);
        List<OrderEntity> orderList = pageList.getResultList();
        logger.info(JSON.toJSONString(orderList));
    }
}

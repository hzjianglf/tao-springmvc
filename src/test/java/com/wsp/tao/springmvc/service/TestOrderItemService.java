package com.wsp.tao.springmvc.service;

import com.alibaba.fastjson.JSON;
import com.wsp.tao.springmvc.common.utils.PageUtil;
import com.wsp.tao.springmvc.dao.OrderItemDao;
import com.wsp.tao.springmvc.entity.OrderEntity;
import com.wsp.tao.springmvc.entity.OrderItemEntity;
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
public class TestOrderItemService {
    //定义一个全局的记录器，通过LoggerFactory获取
    private final static Logger logger = LoggerFactory.getLogger(TestOrderItemService.class);

    @Autowired
    private OrderItemService orderItemService;

    @Test
    public void save() {
        OrderItemEntity orderItem = new OrderItemEntity();
        orderItem.setCreateDate(new Date());
        orderItem.setModifyDate(new Date());
        orderItem.setFullName("毛呢大衣");
        orderItemService.save(orderItem);
        logger.info(JSON.toJSONString(orderItem));
    }

    @Test
    public void find() {
        OrderItemEntity orderItem = orderItemService.find(5L);
        OrderEntity order = orderItem.getOrders();
        logger.info(JSON.toJSONString(orderItem));
    }

    @Test
    public void queryPages() {

        PageUtil pageUtil = new PageUtil();
        pageUtil.setPageNow(1);
        pageUtil.setPageSize(2);
        pageUtil.setModelName("OrderItemEntity");
        QueryResult<OrderItemEntity> pageList = orderItemService.queryPages(pageUtil);
        List<OrderItemEntity> orderList = pageList.getResultList();
        logger.info(JSON.toJSONString(orderList));
    }
}

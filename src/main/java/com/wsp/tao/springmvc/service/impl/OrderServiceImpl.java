package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.dao.MemberDao;
import com.wsp.tao.springmvc.dao.OrderDao;
import com.wsp.tao.springmvc.entity.OrderEntity;
import com.wsp.tao.springmvc.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Service
public class OrderServiceImpl extends BaseServiceImpl<OrderEntity,Long> implements OrderService {

    @Resource(name = "orderDao")
    public void setBaseDao(OrderDao orderDao) {
        super.setBaseDao(orderDao);
    }
}

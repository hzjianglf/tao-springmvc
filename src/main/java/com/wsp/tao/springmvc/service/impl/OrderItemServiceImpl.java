package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.dao.OrderDao;
import com.wsp.tao.springmvc.dao.OrderItemDao;
import com.wsp.tao.springmvc.entity.OrderItemEntity;
import com.wsp.tao.springmvc.service.OrderItemService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Service
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItemEntity,Long> implements OrderItemService {
    @Resource(name = "orderItemDao")
    public void setBaseDao(OrderItemDao orderItemDao) {
        super.setBaseDao(orderItemDao);
    }
}

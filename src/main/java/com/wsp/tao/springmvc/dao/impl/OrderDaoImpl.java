package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.dao.OrderDao;
import com.wsp.tao.springmvc.entity.OrderEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Repository("orderDao")
public class OrderDaoImpl extends BaseDaoImpl<OrderEntity,Long> implements OrderDao {
}

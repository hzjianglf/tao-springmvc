package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.dao.OrderItemDao;
import com.wsp.tao.springmvc.entity.OrderItemEntity;
import org.springframework.stereotype.Repository;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Repository("orderItemDao")
public class OrderItemDaoImpl extends BaseDaoImpl<OrderItemEntity,Long> implements OrderItemDao {

}

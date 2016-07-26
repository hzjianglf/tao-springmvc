package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.dao.BaseDao;
import com.wsp.tao.springmvc.service.BaseService;

import java.io.Serializable;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
public class BaseServiceImpl<T,ID extends Serializable> implements BaseService<T,ID> {

    private BaseDao<T, ID> baseDao;

    public void setBaseDao(BaseDao<T, ID> baseDao) {
        this.baseDao = baseDao;
    }

    @Override
    public void save(T entity) {
        baseDao.save(entity);
    }
}

package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.common.utils.PageUtil;
import com.wsp.tao.springmvc.dao.BaseDao;
import com.wsp.tao.springmvc.entity.QueryResult;
import com.wsp.tao.springmvc.service.BaseService;

import java.io.Serializable;
import java.util.List;

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

    @Override
    public void remove(T entity) {
        baseDao.remove(entity);
    }

    public void update(T entity) {
        baseDao.update(entity);
    }

    @Override
    public T find(ID id) {
        return baseDao.find(id);
    }

    public List<T> createQuery(String query) {
        return baseDao.createQuery(query);
    }

    public List<T> createSqlQuery(String querySql) {
        return baseDao.createSqlQuery(querySql);
    }

    public QueryResult queryPages(PageUtil page) {
        return baseDao.queryPages(page);
    }
}

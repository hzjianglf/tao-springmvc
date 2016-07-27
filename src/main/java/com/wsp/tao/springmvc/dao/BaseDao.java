package com.wsp.tao.springmvc.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/26.
 */
public interface BaseDao<T, ID extends Serializable> {



    /**
     * 持久化实体对象
     *
     * @param entity
     *            实体对象
     */
    void save(T entity);


    /**
     * 移除实体对象
     *
     * @param entity
     *            实体对象
     */
    void remove(T entity);

    /**
     * 修改实体对象
     *
     * @param entity
     *            实体对象
     */
    void update(T entity);


    /**
     * 查找实体对象
     *
     * @param id
     *            ID
     * @return 实体对象，若不存在则返回null
     */
    T find(ID id);


    /**
     * 查询实体对象
     *
     * @param entity
     *            实体对象
     */
    List<T> createQuery(String query);

    /**
     * 根据原生sql查询
     *
     * @param entity
     *            实体对象
     */
    List<T> createSqlQuery(String querySql);
}

package com.wsp.tao.springmvc.service;

import java.io.Serializable;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
public interface BaseService<T,ID extends Serializable> {


    /**
     * 查找实体对象
     *
     * @param id
     *            ID
     * @return 实体对象，若不存在则返回null
     */
    T find(ID id);


    /**
     * 持久化实体对象
     *
     * @param entity
     *            实体对象
     */
    void save(T entity);

    /**
     * 合并实体对象
     *
     * @param entity
     *            实体对象
     * @return 实体对象
     */
    T merge(T entity);

    /**
     * 移除实体对象
     *
     * @param entity
     *            实体对象
     */
    void remove(T entity);

    /**
     * 刷新实体对象
     *
     * @param entity
     *            实体对象
     */
    void refresh(T entity);
}

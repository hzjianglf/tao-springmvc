package com.wsp.tao.springmvc.dao;

import java.io.Serializable;

/**
 * Created by wangshupeng1 on 2016/7/26.
 */
public interface BaseDao<T, ID extends Serializable> {



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

    /**
     * 获取实体对象ID
     *
     * @param entity
     *            实体对象
     * @return 实体对象ID
     */
    ID getIdentifier(T entity);

    /**
     * 判断是否为托管状态
     *
     * @param entity
     *            实体对象
     * @return 是否为托管状态
     */
    boolean isManaged(T entity);

    /**
     * 设置为游离状态
     *
     * @param entity
     *            实体对象
     */
    void detach(T entity);

    /**
     * 清除缓存
     */
    void clear();

    /**
     * 同步数据
     */
    void flush();


}

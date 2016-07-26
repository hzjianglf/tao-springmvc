package com.wsp.tao.springmvc.service;

import java.io.Serializable;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
public interface BaseService<T,ID extends Serializable> {
    /**
     * 保存实体对象
     *
     * @param entity
     *            实体对象
     */
    void save(T entity);
}

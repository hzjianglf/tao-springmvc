package com.wsp.tao.springmvc.dao;

import com.wsp.tao.springmvc.entity.Book;

/**
 * Created by wangshupeng1 on 2016/7/24.
 */
public interface BookDao {
    //数据库模型
    public void add(Book book);
    public void update(Book book);
}

package com.wsp.tao.springmvc.dao.impl;

import com.wsp.tao.springmvc.dao.BookDao;
import com.wsp.tao.springmvc.entity.Book;
import org.springframework.stereotype.Service;

/**
 * Created by wangshupeng1 on 2016/7/24.
 */
@Service
public class BookDaoImpl implements BookDao {
    public void add(Book book) {
        System.out.print("Add");
    }

    public void update(Book book) {
        System.out.print("update");
    }
}

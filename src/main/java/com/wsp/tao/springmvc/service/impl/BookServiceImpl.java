package com.wsp.tao.springmvc.service.impl;

import com.wsp.tao.springmvc.dao.BookDao;
import com.wsp.tao.springmvc.entity.Book;
import com.wsp.tao.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by wangshupeng1 on 2016/7/24.
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;


    public void add(Book book) {
        bookDao.add(book);
    }

    public void update(Book book) {
        bookDao.update(book);
    }
}

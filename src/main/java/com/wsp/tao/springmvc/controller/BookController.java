package com.wsp.tao.springmvc.controller;

import com.wsp.tao.springmvc.entity.Book;
import com.wsp.tao.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangshupeng1 on 2016/7/24.
 */
@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(Book book){
        System.out.println("bookname:"+book.getName());
        System.out.println("author:"+book.getAuthor());
        bookService.add(book);
        return "success";
    }

    @RequestMapping(params = "method=update")
    public String update(Book book) {
        bookService.update(book);
        return "success";
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public String delete(Book book){
        System.out.print("删除");
        return "delete";
    }
}

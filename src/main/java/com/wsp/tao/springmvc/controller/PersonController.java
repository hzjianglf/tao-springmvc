package com.wsp.tao.springmvc.controller;

import com.wsp.tao.springmvc.entity.Book;
import com.wsp.tao.springmvc.entity.PersonEntity;
import com.wsp.tao.springmvc.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Timestamp;
import java.util.Date;
import java.util.UUID;

/**
 * Created by wangshupeng1 on 2016/7/26.
 */
@Controller
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;


    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(PersonEntity personVo){
        PersonEntity person = new PersonEntity();
        person.setName("王树鹏7");
        person.setAddress("长安街");
        person.setAge(11L);
        person.setApplicantId("3");
        person.setId(UUID.randomUUID().toString());
        person.setCreateTime(new Timestamp(new Date().getTime()));
        String id = personService.save(person);
        System.out.print(id);
        return "success";
    }
}

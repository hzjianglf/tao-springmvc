package com.wsp.tao.springmvc.controller;

import com.wsp.tao.springmvc.entity.MemberEntity;
import com.wsp.tao.springmvc.entity.PersonEntity;
import com.wsp.tao.springmvc.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

/**
 * Created by wangshupeng1 on 2016/7/26.
 */
@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(MemberEntity member) {
        member.setAddress("a");
        member.setCreateDate(new Date());
        memberService.save(member);
        System.out.print("test");
        return "success";
    }
}

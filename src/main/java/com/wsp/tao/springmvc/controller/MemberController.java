package com.wsp.tao.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.wsp.tao.springmvc.entity.MemberEntity;
import com.wsp.tao.springmvc.entity.PersonEntity;
import com.wsp.tao.springmvc.service.MemberService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final static Logger logger = LoggerFactory.getLogger(MemberController.class);
    @Autowired
    private MemberService memberService;

    /**
     * @Title       MemberController
     * @Description 会员请求数据
     * @Autohr      王树鹏【wangshupeng1@jd.com】
     * @Date        2016/7/27 8:39
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(MemberEntity member) {
        member.setAddress("a");
        member.setCreateDate(new Date());
        memberService.save(member);
        logger.info("MemberController add member req:{}",JSON.toJSONString(member));
        return "success";
    }
}

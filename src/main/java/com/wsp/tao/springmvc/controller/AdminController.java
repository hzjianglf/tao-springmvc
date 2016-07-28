package com.wsp.tao.springmvc.controller;

import com.wsp.tao.springmvc.common.utils.PageUtil;
import com.wsp.tao.springmvc.entity.OrderEntity;
import com.wsp.tao.springmvc.entity.QueryResult;
import com.wsp.tao.springmvc.entity.SysUser;
import com.wsp.tao.springmvc.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@Controller
@RequestMapping("/admin")
public class AdminController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String add(PageUtil<SysUser> page,Model model) {
//        if(null != page){
//            page = new PageUtil<SysUser>(page.getPageNow(),page.getPageSize() <=0 ? 10:page.getPageSize());
//        }else{
//            page = new PageUtil<SysUser>(1,10);
//        }
        page = new PageUtil<SysUser>(1,10);
        page.setModelName("SysUser");
        QueryResult<SysUser> sysUserResult = sysUserService.queryPages(page);
        model.addAttribute("sysUserList",sysUserResult.getResultList());
        return "/admin/list";
    }

}

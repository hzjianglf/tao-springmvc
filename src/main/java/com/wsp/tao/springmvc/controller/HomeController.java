package com.wsp.tao.springmvc.controller;

import com.wsp.tao.springmvc.entity.MemberEntity;
import com.wsp.tao.springmvc.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@Controller
public class HomeController {

    @RequestMapping(value="/login",method=RequestMethod.GET)
    public String loginForm(Model model){
        model.addAttribute("user", new SysUser());
        return "/login";
    }

    @RequestMapping(value="/login",method=RequestMethod.POST)
    public String login(SysUser user,BindingResult bindingResult,RedirectAttributes redirectAttributes){
        try {
            if(bindingResult.hasErrors()){
                return "/login";
            }
            //使用权限工具进行用户登录，登录成功后跳到shiro配置的successUrl中，与下面的return没什么关系！
            SecurityUtils.getSubject().login(new UsernamePasswordToken(user.getUsername(), user.getPassword()));
            return "redirect:/user";
        } catch (AuthenticationException e) {
            redirectAttributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/login";
        }
    }

    @RequestMapping(value="/logout",method=RequestMethod.GET)
    public String logout(RedirectAttributes redirectAttributes ){
        //使用权限管理工具进行用户的退出，跳出登录，给出提示信息
        SecurityUtils.getSubject().logout();
        redirectAttributes.addFlashAttribute("message", "您已安全退出");
        return "redirect:/login";
    }

    @RequestMapping(value = "/success",method=RequestMethod.GET)
    public String login() {
        return "/success";
    }

    @RequestMapping("/index")
    public String index(){
        return "/index";
    }

    /**
     * @Title       indexController
     * @Description  首页所需数据
     * @Autohr      王树鹏【wangshupeng1@jd.com】
     * @Date        2016/7/28 23:14
     */
    @RequestMapping("/welcome")
    public String welcome(Model model){
        MemberEntity member = new MemberEntity();
        member.setAddress("北京市朝阳区");
        model.addAttribute("member",member);
        return "/welcome";
    }

    @RequestMapping("/403")
    public String unauthorizedRole(){
        return "/403";
    }
}

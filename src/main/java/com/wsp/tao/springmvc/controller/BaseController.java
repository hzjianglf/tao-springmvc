package com.wsp.tao.springmvc.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
public class BaseController {
    
    /**
     * @Title       BaseController
     * @Description 获取当前登录人ID
     * @Autohr      王树鹏【wangshupeng1@jd.com】
     * @Date        2016/7/28 23:40
     */
    public Long getCurrtentUserId(){
        Subject currentUser = SecurityUtils.getSubject();
        Long currentUseId = (Long) currentUser.getSession().getAttribute("currentUserId");
        return currentUseId;
    }

    /**
     * @Title       BaseController
     * @Description 获取当前登录人用户名
     * @Autohr      王树鹏【wangshupeng1@jd.com】
     * @Date        2016/7/28 23:39
     */
    public String getCurrtentUsername(){
        Subject currentUser = SecurityUtils.getSubject();
        String currentUsename = (String) currentUser.getSession().getAttribute("currentUsername");
        return currentUsename;
    }
}

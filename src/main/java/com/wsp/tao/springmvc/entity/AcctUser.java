package com.wsp.tao.springmvc.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by wangshupeng1 on 2016/7/24.
 */
public class AcctUser implements Serializable {

    private String id;
    private String nickName;
    private String telephone;
    private Date registerTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }
}

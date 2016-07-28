package com.wsp.tao.springmvc.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wangshupeng1 on 2016/7/28.
 * 按钮权限
 */

@Entity
@Table(name = "t_sys_permission", schema = "", catalog = "tao")
public class SysPermission {
    private int id;
    private String code;
    private String description;
    private Date createTime;
    private SysResource resource;	//所属菜单
    private Integer isChecked;		//临时标记，判断是否选中

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @ManyToOne(cascade=CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinColumn(name = "resource_id",nullable = false)
    public SysResource getResource() {
        return resource;
    }

    public void setResource(SysResource resource) {
        this.resource = resource;
    }

    @Transient
    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }
}

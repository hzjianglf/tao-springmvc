package com.wsp.tao.springmvc.entity;

import com.google.common.collect.Lists;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@Entity
@Table(name = "t_sys_role", schema = "", catalog = "tao")
public class SysRole {
    private int id;
    private String name;
    private String description;
    private Timestamp createTime;

    private List<SysResource> resourceList = Lists.newArrayList();			// 菜单列表
    private List<SysPermission> permissionList = Lists.newArrayList();		//权限列表
    private Integer isChecked;												//临时标记，判断是否选中
    private List<SysUser> userList = Lists.newArrayList();					//用户列表

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @ManyToMany(cascade =CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinTable(name = "t_sys_role_resource_rel", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = { @JoinColumn(name = "resource_id") })
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("id")
    public List<SysResource> getResourceList() {
        return resourceList;
    }

    public void setResourceList(List<SysResource> resourceList) {
        this.resourceList = resourceList;
    }

    @ManyToMany(cascade =CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinTable(name = "t_sys_role_perminssion_rel", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = { @JoinColumn(name = "permission_id") })
    @Fetch(FetchMode.SUBSELECT)
    public List<SysPermission> getPermissionList() {
        return permissionList;
    }

    public void setPermissionList(List<SysPermission> permissionList) {
        this.permissionList = permissionList;
    }

    public Integer getIsChecked() {
        return isChecked;
    }

    public void setIsChecked(Integer isChecked) {
        this.isChecked = isChecked;
    }

    @ManyToMany(mappedBy="roleList",cascade=CascadeType.REFRESH,fetch = FetchType.EAGER)
    @OrderBy("id")
    public List<SysUser> getUserList() {
        return userList;
    }

    public void setUserList(List<SysUser> userList) {
        this.userList = userList;
    }
}

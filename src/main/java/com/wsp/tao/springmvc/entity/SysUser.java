package com.wsp.tao.springmvc.entity;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.wsp.tao.springmvc.common.utils.Collections3;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created by wangshupeng1 on 2016/7/28.
 */
@Entity
@Table(name = "t_sys_user", schema = "", catalog = "tao")
public class SysUser {

    private int id;
    private String username;
    private String password;
    private String realName;
    private String description;
    private String telNum;
    private String email;
    private int status;
    private String salt;
    private Date createDate;

    private Date modifyDate;

    private List<SysRole> roleList = Lists.newArrayList();				//角色列表
    private List<SysResource> resourceList = Lists.newArrayList();		//菜单列表
    private List<SysPermission> permissionList = Lists.newArrayList();	//权限列表

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "real_name")
    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
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
    @Column(name = "tel_num")
    public String getTelNum() {
        return telNum;
    }

    public void setTelNum(String telNum) {
        this.telNum = telNum;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modify_date")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    @ManyToMany(cascade =CascadeType.REFRESH,fetch = FetchType.EAGER)
    @JoinTable(name = "t_sys_user_role_rel", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
    @Fetch(FetchMode.SUBSELECT)
    @OrderBy("id")
    public List<SysRole> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SysRole> roleList) {
        this.roleList = roleList;
    }

    @Transient
    public List<SysResource> getResourceList() {
        for(SysRole role : roleList){
            resourceList.addAll(role.getResourceList());
        }
        resourceList     = Lists.newArrayList(Sets.newHashSet(resourceList));
//        Collections2.sort(resourceList);
        return resourceList;
    }

    public void setResourceList(List<SysResource> resourceList) {
        this.resourceList = resourceList;
    }

    @Transient
    public List<SysPermission> getPermissionList() {

        for(SysRole role : roleList){
            permissionList.addAll(role.getPermissionList());
        }
        permissionList = Lists.newArrayList(Sets.newHashSet(permissionList));
        return permissionList;

    }

    public void setPermissionList(List<SysPermission> permissionList) {
        this.permissionList = permissionList;
    }

    @SuppressWarnings("unchecked")
    @Transient
    public List<String> getRoles() {

        return Collections3.extractToList(roleList, "name");
    }

    @Transient
    public List<String> getPermission() {
        Collection<SysPermission> permissions = Collections2.filter(getPermissionList(), new Predicate<SysPermission>(){
            @Override
            public boolean apply(SysPermission permission) {
                return !StringUtils.isEmpty(permission.getCode());
            }
        });
        return Collections3.extractToList(permissions, "code");
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

}

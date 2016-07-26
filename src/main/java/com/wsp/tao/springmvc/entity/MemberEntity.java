package com.wsp.tao.springmvc.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Entity
@Table(name = "tao_member", schema = "", catalog = "xd_bond")
public class MemberEntity {

    /** ID */
    private long id;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Date createDate;

    @Basic
    @Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    private Date modifyDate;

    @Basic
    @Column(name = "modify_date")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    
    private String address;

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private Long amount;

    @Basic
    @Column(name = "amount")
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    private String attributeValue1;

    @Basic
    @Column(name = "attribute_value1")
    public String getAttributeValue1() {
        return attributeValue1;
    }

    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1;
    }

    private String attributeValue2;

    @Basic
    @Column(name = "attribute_value2")
    public String getAttributeValue2() {
        return attributeValue2;
    }

    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2;
    }

    private String attributeValue3;

    @Basic
    @Column(name = "attribute_value3")
    public String getAttributeValue3() {
        return attributeValue3;
    }

    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3;
    }

    private String attributeValue4;

    @Basic
    @Column(name = "attribute_value4")
    public String getAttributeValue4() {
        return attributeValue4;
    }

    public void setAttributeValue4(String attributeValue4) {
        this.attributeValue4 = attributeValue4;
    }

    private String attributeValue5;

    @Basic
    @Column(name = "attribute_value5")
    public String getAttributeValue5() {
        return attributeValue5;
    }

    public void setAttributeValue5(String attributeValue5) {
        this.attributeValue5 = attributeValue5;
    }

    private String attributeValue6;

    @Basic
    @Column(name = "attribute_value6")
    public String getAttributeValue6() {
        return attributeValue6;
    }

    public void setAttributeValue6(String attributeValue6) {
        this.attributeValue6 = attributeValue6;
    }

    private String email;

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Boolean isEnabled;

    @Basic
    @Column(name = "is_enabled")
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    private Boolean isLocked;

    @Basic
    @Column(name = "is_locked")
    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    private Date lockedDate;

    @Basic
    @Column(name = "locked_date")
    public Date getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    private Date loginDate;

    @Basic
    @Column(name = "login_date")
    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    private Integer loginFailureCount;

    @Basic
    @Column(name = "login_failure_count")
    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    private String loginIp;

    @Basic
    @Column(name = "login_ip")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    private String mobile;

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String name;

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String phone;

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Long point;

    @Basic
    @Column(name = "point")
    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    private String registerIp;

    @Basic
    @Column(name = "register_ip")
    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    private Date safeKeyExpire;

    @Basic
    @Column(name = "safe_key_expire")
    public Date getSafeKeyExpire() {
        return safeKeyExpire;
    }

    public void setSafeKeyExpire(Date safeKeyExpire) {
        this.safeKeyExpire = safeKeyExpire;
    }

    private String safeKeyValue;

    @Basic
    @Column(name = "safe_key_value")
    public String getSafeKeyValue() {
        return safeKeyValue;
    }

    public void setSafeKeyValue(String safeKeyValue) {
        this.safeKeyValue = safeKeyValue;
    }

    private String username;

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String zipCode;

    @Basic
    @Column(name = "zip_code")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private Long area;

    @Basic
    @Column(name = "area")
    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    private Long memberRank;

    @Basic
    @Column(name = "member_rank")
    public Long getMemberRank() {
        return memberRank;
    }

    public void setMemberRank(Long memberRank) {
        this.memberRank = memberRank;
    }

}

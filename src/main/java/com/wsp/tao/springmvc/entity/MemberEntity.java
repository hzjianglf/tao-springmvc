package com.wsp.tao.springmvc.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Entity
@javax.persistence.Table(name = "tao_member", schema = "", catalog = "xd_bond")
public class MemberEntity {
    private long id;

    @Id
    @javax.persistence.Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Timestamp createDate;

    @Basic
    @javax.persistence.Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    private Timestamp modifyDate;

    @Basic
    @javax.persistence.Column(name = "modify_date")
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    private String address;

    @Basic
    @javax.persistence.Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private Long amount;

    @Basic
    @javax.persistence.Column(name = "amount")
    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    private String attributeValue1;

    @Basic
    @javax.persistence.Column(name = "attribute_value1")
    public String getAttributeValue1() {
        return attributeValue1;
    }

    public void setAttributeValue1(String attributeValue1) {
        this.attributeValue1 = attributeValue1;
    }

    private String attributeValue2;

    @Basic
    @javax.persistence.Column(name = "attribute_value2")
    public String getAttributeValue2() {
        return attributeValue2;
    }

    public void setAttributeValue2(String attributeValue2) {
        this.attributeValue2 = attributeValue2;
    }

    private String attributeValue3;

    @Basic
    @javax.persistence.Column(name = "attribute_value3")
    public String getAttributeValue3() {
        return attributeValue3;
    }

    public void setAttributeValue3(String attributeValue3) {
        this.attributeValue3 = attributeValue3;
    }

    private String attributeValue4;

    @Basic
    @javax.persistence.Column(name = "attribute_value4")
    public String getAttributeValue4() {
        return attributeValue4;
    }

    public void setAttributeValue4(String attributeValue4) {
        this.attributeValue4 = attributeValue4;
    }

    private String attributeValue5;

    @Basic
    @javax.persistence.Column(name = "attribute_value5")
    public String getAttributeValue5() {
        return attributeValue5;
    }

    public void setAttributeValue5(String attributeValue5) {
        this.attributeValue5 = attributeValue5;
    }

    private String attributeValue6;

    @Basic
    @javax.persistence.Column(name = "attribute_value6")
    public String getAttributeValue6() {
        return attributeValue6;
    }

    public void setAttributeValue6(String attributeValue6) {
        this.attributeValue6 = attributeValue6;
    }

    private String email;

    @Basic
    @javax.persistence.Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private Boolean isEnabled;

    @Basic
    @javax.persistence.Column(name = "is_enabled")
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    private Boolean isLocked;

    @Basic
    @javax.persistence.Column(name = "is_locked")
    public Boolean getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    private Timestamp lockedDate;

    @Basic
    @javax.persistence.Column(name = "locked_date")
    public Timestamp getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Timestamp lockedDate) {
        this.lockedDate = lockedDate;
    }

    private Timestamp loginDate;

    @Basic
    @javax.persistence.Column(name = "login_date")
    public Timestamp getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
    }

    private Integer loginFailureCount;

    @Basic
    @javax.persistence.Column(name = "login_failure_count")
    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    private String loginIp;

    @Basic
    @javax.persistence.Column(name = "login_ip")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    private String mobile;

    @Basic
    @javax.persistence.Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String password;

    @Basic
    @javax.persistence.Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String phone;

    @Basic
    @javax.persistence.Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private Long point;

    @Basic
    @javax.persistence.Column(name = "point")
    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
    }

    private String registerIp;

    @Basic
    @javax.persistence.Column(name = "register_ip")
    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp;
    }

    private Timestamp safeKeyExpire;

    @Basic
    @javax.persistence.Column(name = "safe_key_expire")
    public Timestamp getSafeKeyExpire() {
        return safeKeyExpire;
    }

    public void setSafeKeyExpire(Timestamp safeKeyExpire) {
        this.safeKeyExpire = safeKeyExpire;
    }

    private String safeKeyValue;

    @Basic
    @javax.persistence.Column(name = "safe_key_value")
    public String getSafeKeyValue() {
        return safeKeyValue;
    }

    public void setSafeKeyValue(String safeKeyValue) {
        this.safeKeyValue = safeKeyValue;
    }

    private String username;

    @Basic
    @javax.persistence.Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String zipCode;

    @Basic
    @javax.persistence.Column(name = "zip_code")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    private Long area;

    @Basic
    @javax.persistence.Column(name = "area")
    public Long getArea() {
        return area;
    }

    public void setArea(Long area) {
        this.area = area;
    }

    private Long memberRank;

    @Basic
    @javax.persistence.Column(name = "member_rank")
    public Long getMemberRank() {
        return memberRank;
    }

    public void setMemberRank(Long memberRank) {
        this.memberRank = memberRank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberEntity that = (MemberEntity) o;

        if (id != that.id) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (attributeValue1 != null ? !attributeValue1.equals(that.attributeValue1) : that.attributeValue1 != null)
            return false;
        if (attributeValue2 != null ? !attributeValue2.equals(that.attributeValue2) : that.attributeValue2 != null)
            return false;
        if (attributeValue3 != null ? !attributeValue3.equals(that.attributeValue3) : that.attributeValue3 != null)
            return false;
        if (attributeValue4 != null ? !attributeValue4.equals(that.attributeValue4) : that.attributeValue4 != null)
            return false;
        if (attributeValue5 != null ? !attributeValue5.equals(that.attributeValue5) : that.attributeValue5 != null)
            return false;
        if (attributeValue6 != null ? !attributeValue6.equals(that.attributeValue6) : that.attributeValue6 != null)
            return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (isEnabled != null ? !isEnabled.equals(that.isEnabled) : that.isEnabled != null) return false;
        if (isLocked != null ? !isLocked.equals(that.isLocked) : that.isLocked != null) return false;
        if (lockedDate != null ? !lockedDate.equals(that.lockedDate) : that.lockedDate != null) return false;
        if (loginDate != null ? !loginDate.equals(that.loginDate) : that.loginDate != null) return false;
        if (loginFailureCount != null ? !loginFailureCount.equals(that.loginFailureCount) : that.loginFailureCount != null)
            return false;
        if (loginIp != null ? !loginIp.equals(that.loginIp) : that.loginIp != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (point != null ? !point.equals(that.point) : that.point != null) return false;
        if (registerIp != null ? !registerIp.equals(that.registerIp) : that.registerIp != null) return false;
        if (safeKeyExpire != null ? !safeKeyExpire.equals(that.safeKeyExpire) : that.safeKeyExpire != null)
            return false;
        if (safeKeyValue != null ? !safeKeyValue.equals(that.safeKeyValue) : that.safeKeyValue != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (zipCode != null ? !zipCode.equals(that.zipCode) : that.zipCode != null) return false;
        if (area != null ? !area.equals(that.area) : that.area != null) return false;
        if (memberRank != null ? !memberRank.equals(that.memberRank) : that.memberRank != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (attributeValue1 != null ? attributeValue1.hashCode() : 0);
        result = 31 * result + (attributeValue2 != null ? attributeValue2.hashCode() : 0);
        result = 31 * result + (attributeValue3 != null ? attributeValue3.hashCode() : 0);
        result = 31 * result + (attributeValue4 != null ? attributeValue4.hashCode() : 0);
        result = 31 * result + (attributeValue5 != null ? attributeValue5.hashCode() : 0);
        result = 31 * result + (attributeValue6 != null ? attributeValue6.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (isEnabled != null ? isEnabled.hashCode() : 0);
        result = 31 * result + (isLocked != null ? isLocked.hashCode() : 0);
        result = 31 * result + (lockedDate != null ? lockedDate.hashCode() : 0);
        result = 31 * result + (loginDate != null ? loginDate.hashCode() : 0);
        result = 31 * result + (loginFailureCount != null ? loginFailureCount.hashCode() : 0);
        result = 31 * result + (loginIp != null ? loginIp.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (point != null ? point.hashCode() : 0);
        result = 31 * result + (registerIp != null ? registerIp.hashCode() : 0);
        result = 31 * result + (safeKeyExpire != null ? safeKeyExpire.hashCode() : 0);
        result = 31 * result + (safeKeyValue != null ? safeKeyValue.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (area != null ? area.hashCode() : 0);
        result = 31 * result + (memberRank != null ? memberRank.hashCode() : 0);
        return result;
    }
}

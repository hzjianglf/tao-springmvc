package com.wsp.tao.springmvc.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Created by wangshupeng1 on 2016/7/25.
 */
@Entity
@Table(name = "person", schema = "", catalog = "xd_bond")
public class PersonEntity {
    private String id;
    private String applicantId;
    private String name;
    private Long sex;
    private Long age;
    private String idNoUrl;
    private String profession;
    private String incomeCertificatUrl;
    private BigDecimal wages;
    private String emergencyContactOne;
    private String emergencyContactOneMobile;
    private String emergencyContactTwo;
    private String emergencyContactTwoMobile;
    private String address;
    private Timestamp createTime;
    private String mobile;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "applicant_id")
    public String getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(String applicantId) {
        this.applicantId = applicantId;
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
    @Column(name = "sex")
    public Long getSex() {
        return sex;
    }

    public void setSex(Long sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "age")
    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Basic
    @Column(name = "id_no_url")
    public String getIdNoUrl() {
        return idNoUrl;
    }

    public void setIdNoUrl(String idNoUrl) {
        this.idNoUrl = idNoUrl;
    }

    @Basic
    @Column(name = "profession")
    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Basic
    @Column(name = "income_certificat_url")
    public String getIncomeCertificatUrl() {
        return incomeCertificatUrl;
    }

    public void setIncomeCertificatUrl(String incomeCertificatUrl) {
        this.incomeCertificatUrl = incomeCertificatUrl;
    }

    @Basic
    @Column(name = "wages")
    public BigDecimal getWages() {
        return wages;
    }

    public void setWages(BigDecimal wages) {
        this.wages = wages;
    }

    @Basic
    @Column(name = "emergency_contact_one")
    public String getEmergencyContactOne() {
        return emergencyContactOne;
    }

    public void setEmergencyContactOne(String emergencyContactOne) {
        this.emergencyContactOne = emergencyContactOne;
    }

    @Basic
    @Column(name = "emergency_contact_one_mobile")
    public String getEmergencyContactOneMobile() {
        return emergencyContactOneMobile;
    }

    public void setEmergencyContactOneMobile(String emergencyContactOneMobile) {
        this.emergencyContactOneMobile = emergencyContactOneMobile;
    }

    @Basic
    @Column(name = "emergency_contact_two")
    public String getEmergencyContactTwo() {
        return emergencyContactTwo;
    }

    public void setEmergencyContactTwo(String emergencyContactTwo) {
        this.emergencyContactTwo = emergencyContactTwo;
    }

    @Basic
    @Column(name = "emergency_contact_two_mobile")
    public String getEmergencyContactTwoMobile() {
        return emergencyContactTwoMobile;
    }

    public void setEmergencyContactTwoMobile(String emergencyContactTwoMobile) {
        this.emergencyContactTwoMobile = emergencyContactTwoMobile;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "mobile")
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (applicantId != null ? !applicantId.equals(that.applicantId) : that.applicantId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (age != null ? !age.equals(that.age) : that.age != null) return false;
        if (idNoUrl != null ? !idNoUrl.equals(that.idNoUrl) : that.idNoUrl != null) return false;
        if (profession != null ? !profession.equals(that.profession) : that.profession != null) return false;
        if (incomeCertificatUrl != null ? !incomeCertificatUrl.equals(that.incomeCertificatUrl) : that.incomeCertificatUrl != null)
            return false;
        if (wages != null ? !wages.equals(that.wages) : that.wages != null) return false;
        if (emergencyContactOne != null ? !emergencyContactOne.equals(that.emergencyContactOne) : that.emergencyContactOne != null)
            return false;
        if (emergencyContactOneMobile != null ? !emergencyContactOneMobile.equals(that.emergencyContactOneMobile) : that.emergencyContactOneMobile != null)
            return false;
        if (emergencyContactTwo != null ? !emergencyContactTwo.equals(that.emergencyContactTwo) : that.emergencyContactTwo != null)
            return false;
        if (emergencyContactTwoMobile != null ? !emergencyContactTwoMobile.equals(that.emergencyContactTwoMobile) : that.emergencyContactTwoMobile != null)
            return false;
        if (address != null ? !address.equals(that.address) : that.address != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (applicantId != null ? applicantId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (idNoUrl != null ? idNoUrl.hashCode() : 0);
        result = 31 * result + (profession != null ? profession.hashCode() : 0);
        result = 31 * result + (incomeCertificatUrl != null ? incomeCertificatUrl.hashCode() : 0);
        result = 31 * result + (wages != null ? wages.hashCode() : 0);
        result = 31 * result + (emergencyContactOne != null ? emergencyContactOne.hashCode() : 0);
        result = 31 * result + (emergencyContactOneMobile != null ? emergencyContactOneMobile.hashCode() : 0);
        result = 31 * result + (emergencyContactTwo != null ? emergencyContactTwo.hashCode() : 0);
        result = 31 * result + (emergencyContactTwoMobile != null ? emergencyContactTwoMobile.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
        return result;
    }
}

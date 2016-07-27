package com.wsp.tao.springmvc.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by wangshupeng1 on 2016/7/27.
 */
@Entity
@javax.persistence.Table(name = "tao_order", schema = "", catalog = "tao")
public class OrderEntity {
    private long id;

    @Id
    @javax.persistence.Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Date createDate;

    @Basic
    @javax.persistence.Column(name = "create_date")
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    private Date modifyDate;

    @Basic
    @javax.persistence.Column(name = "modify_date")
    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
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

    private Integer amountPaid;

    @Basic
    @javax.persistence.Column(name = "amount_paid")
    public Integer getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(Integer amountPaid) {
        this.amountPaid = amountPaid;
    }

    private String areaName;

    @Basic
    @javax.persistence.Column(name = "area_name")
    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    private String consignee;

    @Basic
    @javax.persistence.Column(name = "consignee")
    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    private Integer couponDiscount;

    @Basic
    @javax.persistence.Column(name = "coupon_discount")
    public Integer getCouponDiscount() {
        return couponDiscount;
    }

    public void setCouponDiscount(Integer couponDiscount) {
        this.couponDiscount = couponDiscount;
    }

    private Date expire;

    @Basic
    @javax.persistence.Column(name = "expire")
    public Date getExpire() {
        return expire;
    }

    public void setExpire(Date expire) {
        this.expire = expire;
    }

    private Integer fee;

    @Basic
    @javax.persistence.Column(name = "fee")
    public Integer getFee() {
        return fee;
    }

    public void setFee(Integer fee) {
        this.fee = fee;
    }

    private Integer freight;

    @Basic
    @javax.persistence.Column(name = "freight")
    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    private String invoiceTitle;

    @Basic
    @javax.persistence.Column(name = "invoice_title")
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    private Boolean isAllocatedStock;

    @Basic
    @javax.persistence.Column(name = "is_allocated_stock")
    public Boolean getIsAllocatedStock() {
        return isAllocatedStock;
    }

    public void setIsAllocatedStock(Boolean isAllocatedStock) {
        this.isAllocatedStock = isAllocatedStock;
    }

    private Boolean isInvoice;

    @Basic
    @javax.persistence.Column(name = "is_invoice")
    public Boolean getIsInvoice() {
        return isInvoice;
    }

    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }

    private Date lockExpire;

    @Basic
    @javax.persistence.Column(name = "lock_expire")
    public Date getLockExpire() {
        return lockExpire;
    }

    public void setLockExpire(Date lockExpire) {
        this.lockExpire = lockExpire;
    }

    private String memo;

    @Basic
    @javax.persistence.Column(name = "memo")
    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    private Integer offsetAmount;

    @Basic
    @javax.persistence.Column(name = "offset_amount")
    public Integer getOffsetAmount() {
        return offsetAmount;
    }

    public void setOffsetAmount(Integer offsetAmount) {
        this.offsetAmount = offsetAmount;
    }

    private Integer orderStatus;

    @Basic
    @javax.persistence.Column(name = "order_status")
    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    private String paymentMethodName;

    @Basic
    @javax.persistence.Column(name = "payment_method_name")
    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName;
    }

    private Integer paymentStatus;

    @Basic
    @javax.persistence.Column(name = "payment_status")
    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
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

    private String promotion;

    @Basic
    @javax.persistence.Column(name = "promotion")
    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    private Integer promotionDiscount;

    @Basic
    @javax.persistence.Column(name = "promotion_discount")
    public Integer getPromotionDiscount() {
        return promotionDiscount;
    }

    public void setPromotionDiscount(Integer promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    private String shippingMethodName;

    @Basic
    @javax.persistence.Column(name = "shipping_method_name")
    public String getShippingMethodName() {
        return shippingMethodName;
    }

    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
    }

    private Integer shippingStatus;

    @Basic
    @javax.persistence.Column(name = "shipping_status")
    public Integer getShippingStatus() {
        return shippingStatus;
    }

    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    private String sn;

    @Basic
    @javax.persistence.Column(name = "sn")
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    private Integer tax;

    @Basic
    @javax.persistence.Column(name = "tax")
    public Integer getTax() {
        return tax;
    }

    public void setTax(Integer tax) {
        this.tax = tax;
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

    private Long couponCode;

    @Basic
    @javax.persistence.Column(name = "coupon_code")
    public Long getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(Long couponCode) {
        this.couponCode = couponCode;
    }

    private Long member;

    @Basic
    @javax.persistence.Column(name = "member")
    public Long getMember() {
        return member;
    }

    public void setMember(Long member) {
        this.member = member;
    }

    private Long operator;

    @Basic
    @javax.persistence.Column(name = "operator")
    public Long getOperator() {
        return operator;
    }

    public void setOperator(Long operator) {
        this.operator = operator;
    }

    private Long paymentMethod;

    @Basic
    @javax.persistence.Column(name = "payment_method")
    public Long getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(Long paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    private Long shippingMethod;

    @Basic
    @javax.persistence.Column(name = "shipping_method")
    public Long getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(Long shippingMethod) {
        this.shippingMethod = shippingMethod;
    }
}

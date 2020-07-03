package com.example.market.bean;

import java.io.Serializable;
import java.util.Date;

public class Order implements Serializable {
    private Integer orderId;
    private String orderNo;
    private Integer postage;
    private String status;
    private Integer userId;
    private String payment;
    private String orderType;
    private Date endTime;


    public Order(Integer orderId, String orderNo, Integer postage, String status, Integer userId, String payment, String orderType, Date endTime) {
        this.orderId = orderId;
        this.orderNo = orderNo;
        this.postage = postage;
        this.status = status;
        this.userId = userId;
        this.payment = payment;
        this.orderType = orderType;
        this.endTime = endTime;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getPostage() {
        return postage;
    }

    public void setPostage(Integer postage) {
        this.postage = postage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderNo='" + orderNo + '\'' +
                ", postage=" + postage +
                ", status='" + status + '\'' +
                ", userId=" + userId +
                ", payment='" + payment + '\'' +
                ", orderType='" + orderType + '\'' +
                ", endTime=" + endTime +
                '}';
    }
}

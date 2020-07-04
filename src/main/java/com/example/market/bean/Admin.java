package com.example.market.bean;

import java.io.Serializable;

public class Admin implements Serializable {
    private int adminId;
    private String adminPassword;
    private String adminNickname;

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminNickname='" + adminNickname + '\'' +
                '}';
    }

    public Admin(int adminId, String adminPassword, String adminNickname) {
        this.adminId = adminId;
        this.adminPassword = adminPassword;
        this.adminNickname = adminNickname;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminNickname() {
        return adminNickname;
    }

    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname;
    }
}

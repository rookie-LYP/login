package com.example.admin.pojo;


import org.springframework.context.annotation.Bean;

import java.io.Serializable;


public class Admin implements Serializable {
    private static final long serialVersionUID = 874094998858861623L;

    private Integer adminId;

    private String adminAccount;

    private String adminPassword;


    public Integer getAdminId() {
        return adminId;
    }

    public String getAdminAccount() {
        return adminAccount;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "adminId=" + adminId +
                ", adminAccount='" + adminAccount + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }

    public Admin() {

    }
}

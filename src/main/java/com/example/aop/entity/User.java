package com.example.aop.entity;

import com.example.aop.annotation.SensitiveInfo;
import com.example.aop.enums.SensitiveType;

/**
 * @author lee
 * @version 1.0
 * @date 2021/1/27
 */


public class User {

    @SensitiveInfo(SensitiveType.CHINESE_NAME)
    private String name;


    @SensitiveInfo(SensitiveType.ID_CARD)
    private String idNo;

    private String username;

    private String password;

    @SensitiveInfo(SensitiveType.EMAIL)
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

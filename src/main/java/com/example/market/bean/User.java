package com.example.market.bean;


import java.io.Serializable;

public class User implements Serializable {
    private Integer UserId;
    private String Phone;
    private String UserName;
    private String Gender;
    private String Address;
    private String Email;
    private String PassWord;
    private String NikeName;
    private Integer Type;

    public User(){
        super();
    }

    public User(Integer userId, String phone, String userName, String gender, String address, String email, String passWord, String nikeName, Integer type) {
        UserId = userId;
        Phone = phone;
        UserName = userName;
        Gender = gender;
        Address = address;
        Email = email;
        PassWord = passWord;
        NikeName = nikeName;
        Type = type;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Integer getType() {
        return Type;
    }

    public void setType(Integer type) {
        Type = type;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getNikeName() {
        return NikeName;
    }

    public void setNikeName(String nikeName) {
        NikeName = nikeName;
    }

    @Override
    public String toString() {
        return "User{" +
                "UserId=" + UserId +
                ", Phone='" + Phone + '\'' +
                ", UserName='" + UserName + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Address='" + Address + '\'' +
                ", Email='" + Email + '\'' +
                ", PassWord='" + PassWord + '\'' +
                ", NikeName='" + NikeName + '\'' +
                ", Type=" + Type +
                '}';
    }
}



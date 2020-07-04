package com.example.market.service;

import com.example.market.bean.Result;
import com.example.market.bean.User;

import java.util.List;

public interface UserMapper {
    //用户登陆
    User login(String Phone, String PassWord);

    //Phone 号码查询用户
    User getUser(String Phone);

    // 显示所有的用户信息
    Result getUserList();

    // 用户注册
    void insertUser(String Phone,String UserName,String PassWord,String NikeName);

    //  删除用户
    void deleteUser(String  Phone);

    // 修改用信息
    void updateUser(User user);
}

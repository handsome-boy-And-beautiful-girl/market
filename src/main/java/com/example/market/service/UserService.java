package com.example.market.service;


import com.example.market.bean.User;

public interface UserService {
    // 用户登陆
    User login(String Phone,String PassWord);
}

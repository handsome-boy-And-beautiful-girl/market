package com.example.market.service.serviceIn;


import com.example.market.bean.Result;
import com.example.market.bean.User;

import java.util.List;

public interface UserService {
    // 用户登陆
    User login(String Phone,String PassWord);

    //Phone 号码查询用户
    Result getUser(String Phone);

    // 显示所有的用户信息
    Result getUserList();

    // 用户注册
    Result insertUser(String Phone, String UserName, String PassWord, String NikeName);

    // 修改用信息
    Result updateUser(User user);

    // 删除用户
    Result deleteUser(String  Phone);
}

package com.example.market.Dao;


import com.example.market.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 用户登陆
    User login(String Phone,String PassWord);

}

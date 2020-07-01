package com.example.market.service;


import com.example.market.Dao.UserMapper;
import com.example.market.bean.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;

    @Override
    public User login(String Phone, String PassWord) {
        PassWord = DigestUtils.md5Hex(PassWord);
        System.out.println(PassWord);
        return userMapper.login(Phone,PassWord);
    }
}

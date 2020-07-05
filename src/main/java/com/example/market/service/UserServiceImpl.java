package com.example.market.service;


import com.example.market.Dao.UserMapper;
import com.example.market.bean.Result;
import com.example.market.bean.User;
import com.example.market.service.serviceIn.UserService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    // 用户登录
    @Override
    public User login(String Phone, String PassWord) {
        PassWord = DigestUtils.md5Hex(PassWord);
        System.out.println(PassWord);
        return userMapper.login(Phone,PassWord);
    }

    // Phone 查询用户信息
    @Override
    public Result getUser(String Phone) {
        Result result = new Result();
        User user = userMapper.getUser(Phone);
        if(user == null) {
            return  result.error("未查询该用户");
        }
        return result.ok("查询成功",user);
    }

    // 显示所用户信息
    @Override
    public Result getUserList() {
        Result result = new Result();
        List<User> list = userMapper.getUserList();
        for(int i=0;i<list.size();i++){
            list.get(i).setPassWord(null);
        }
        return result.ok("成功",list);
    }

    //用户注册
    @Override
    public Result insertUser(String Phone, String UserName, String PassWord, String NikeName,String Email) {
        Result result  = new Result();
        User user = userMapper.getUser(Phone);
        if(user != null) {
            return result.error("注册失败,用户已经存在");
        }
        userMapper.insertUser(Phone,UserName,PassWord,NikeName,Email);
        user = userMapper.getUser(Phone);
        System.out.println(user.toString());
        return result.ok("用户添加成功",user);
    }

    // 用户修改信息
    @Override
    public Result updateUser(User user) {
        Result result = new Result();
        String Phone = user.getPhone();
        User user1 = userMapper.getUser(Phone);
        if(user1 == null){
            return result.error("对不起，修改错误");
        }
        userMapper.updateUser(user);
        user1=userMapper.getUser(Phone);
        return result.ok("成功",user1);
    }

    @Override
    public Result deleteUser(String Phone) {
        Result result = new Result();
        User user = userMapper.getUser(Phone);
        if(user == null){
            return result.error("用户不存在,无法删除");
        }
        userMapper.deleteUser(Phone);
        return  result.ok("删除成功",null);
    }
}

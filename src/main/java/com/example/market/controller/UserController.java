package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.bean.User;
import com.example.market.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result login(@RequestBody HashMap<String,String>map, HttpServletRequest request){
        String Phone = map.get("Phone");
        String PassWord = map.get("PassWord");
        Result result = new Result();
        User user = userService.login(Phone,PassWord);
        if (user==null){
            return result.error("账号密码错误");
        }
        return result.ok("成功",user);
    }

    //用户查询
    @ResponseBody
    @RequestMapping(value = "/user/getUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getUser(@RequestBody String Phone){
        return userService.getUser(Phone);
    }

    //显示所用户信息
    @ResponseBody
    @RequestMapping(value = "/user/getUserList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getUserList(){
        return userService.getUserList();
    }

    //用户注册
    @ResponseBody
    @RequestMapping(value = "/user/insertUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result insertUser(@RequestBody HashMap<String,String>map){
        String Phone = map.get("Phone");
        String UserName = map.get("UserName");
        String PassWord = map.get("PassWord");
        String NikeName = map.get("NikeName");
        return userService.insertUser(Phone,UserName,PassWord,NikeName);
    }

    //Phone 删除用户
    @ResponseBody
    @RequestMapping(value = "/user/deleteUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result deleteUser(@RequestBody String Phone){
        return userService.deleteUser(Phone);
    }

    //用户修改个人信息
    @ResponseBody
    @RequestMapping(value = "/user/updateUser", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result updateUser(@RequestBody User user){
        return userService.updateUser(user);
    }


}

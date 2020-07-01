package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.bean.User;
import com.example.market.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result login(@RequestBody HashMap<String,String>map){
        String Phone = map.get("Phone");
        String PassWord = map.get("PassWord");
        Result result = new Result();
        User user = userService.login(Phone,PassWord);
        if (user==null){
            return result.error("账号密码错误");
        }
        return result.ok("成功",user);
    }
}

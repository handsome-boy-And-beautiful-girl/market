package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.service.OrderServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
    @Autowired
    OrderServiceImpl orderService;

    @ApiOperation(value = "显示所有订单信息", notes = "不用参数")
    @ResponseBody
    @RequestMapping(value = "/getOrderList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getOrderList(){
        return orderService.getOrderList();
    }
}

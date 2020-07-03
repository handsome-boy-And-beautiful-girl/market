package com.example.market.service;


import com.example.market.Dao.OrderMapper;
import com.example.market.bean.Order;
import com.example.market.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    OrderMapper orderMapper;


    @Override
    public Result getOrderList() {
        Result result = new Result();
        List<Order> list = orderMapper.getOrderList();
        return result.ok("成功", list);
    }
}

package com.example.market.Dao;


import com.example.market.bean.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 订单
@Mapper
public interface OrderMapper {
    // 显示所有订单
    List<Order> getOrderList();
}

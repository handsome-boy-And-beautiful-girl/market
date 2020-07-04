package com.example.market.service;

import com.example.market.bean.Result;
import com.example.market.bean.Shop;

import java.util.List;

public interface ShopMapper {
    // 显示所有商品
    Result getShopList();

    //通过shopName 查询商品
    Shop getShop(String shopName);

    // 添加商品
    void insertShop(Shop shop);

    //修改商品信息
    void updateShop(Shop shop);
}

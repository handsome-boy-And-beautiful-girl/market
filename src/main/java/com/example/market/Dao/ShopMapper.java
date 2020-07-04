package com.example.market.Dao;


import com.example.market.bean.Shop;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 商品
@Mapper
public interface ShopMapper {

    // 显示所有商品
    List<Shop> getShopList();

    //通过shopName 查询商品
    Shop getShop(String shopName);

    // 添加商品
    void insertShop(Shop shop);

    //修改商品信息
    void updateShop(Shop shop);
}

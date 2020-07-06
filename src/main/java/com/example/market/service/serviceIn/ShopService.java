package com.example.market.service.serviceIn;

import com.example.market.bean.Result;
import com.example.market.bean.Shop;

import java.util.List;

public interface ShopService {
    // 显示所有商品
    Result getShopList(Integer pageNum);

    //通过shopName 查询商品
    Result getShop(String shopName);

    // 添加商品
    Result insertShop(Shop shop);

    //修改商品信息
    Result updateShop(Shop shop);

    // 删除商品

    Result deleteShop(Integer id);
}

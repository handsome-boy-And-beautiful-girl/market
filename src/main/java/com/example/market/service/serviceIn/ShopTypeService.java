package com.example.market.service.serviceIn;

import com.example.market.bean.ShopType;

public interface ShopTypeService {
    // 显示所有类别
    ShopType getShopTypeList();

    // 查询类别
    ShopType getShopType(String typeName);

    // 删除类别
    void deleteShopType(Integer typaId,String typeName);

    //添加类别
    void insertShopType(ShopType shopType);

    // 修改类别
    void updateShopType(ShopType shopType);
}

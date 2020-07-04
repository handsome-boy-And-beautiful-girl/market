package com.example.market.service.serviceIn;

import com.example.market.bean.Result;
import com.example.market.bean.ShopType;

public interface ShopTypeService {
    // 显示所有类别
    Result getShopTypeList();

    // 查询类别
    Result getShopType(String typeName);

    // 删除类别
    Result deleteShopType(Integer typaId,String typeName);

    //添加类别
    Result insertShopType(ShopType shopType);

    // 修改类别
    Result updateShopType(ShopType shopType);
}

package com.example.market.Dao;


import com.example.market.bean.ShopType;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 商品类别

@Mapper
public interface ShopTypeMapper {
    // 显示所有类别
    List<ShopType> getShopTypeList();

    // 查询类别
    ShopType getShopType(String typeName);

    // 删除类别
    void deleteShopType(Integer typeId,String typeName);

    //添加类别
    void insertShopType(ShopType shopType);

    // 修改类别
    void updateShopType(ShopType shopType);
}

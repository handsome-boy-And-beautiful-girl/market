package com.example.market.Dao;

import com.example.market.bean.ShopRecommend;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ShopRecommendMapper {

    // 获取推荐的商品list
    List<ShopRecommend> getShopRecommendList();

    // 删除一个推荐的商品
    void deleteShopRecommend(Integer recommendId);

    // 查询一个推荐商品
    ShopRecommend getShopRecommend(Integer recommendId);

    // 添加提个推荐商品

    void insertShopRecommend(ShopRecommend shopRecommend);


}

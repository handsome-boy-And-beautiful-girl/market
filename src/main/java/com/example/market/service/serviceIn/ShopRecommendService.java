package com.example.market.service.serviceIn;


import com.example.market.bean.Result;
import com.example.market.bean.ShopRecommend;

import java.util.List;

public interface ShopRecommendService {
    // 获取推荐的商品list
    Result getShopRecommendList(Integer pageNum);

    // 删除一个推荐的商品
    Result deleteShopRecommend(Integer recommendId);

    // 查询一个推荐商品
    Result getShopRecommend(Integer recommendId);

    // 添加提个推荐商品

    Result insertShopRecommend(ShopRecommend shopRecommend);

}

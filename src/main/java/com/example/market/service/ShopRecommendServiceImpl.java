package com.example.market.service;

import com.example.market.Dao.ShopRecommendMapper;
import com.example.market.bean.Result;
import com.example.market.bean.ShopRecommend;
import com.example.market.bean.User;
import com.example.market.service.serviceIn.ShopRecommendService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//商品推荐

@Service
public class ShopRecommendServiceImpl implements ShopRecommendService {
    @Autowired
    ShopRecommendMapper shopRecommendMapper;

    @Override
    public Result getShopRecommendList(Integer pageNum) {
        Result result = new Result();
        PageHelper.startPage(pageNum,10);
        List<ShopRecommend>list = shopRecommendMapper.getShopRecommendList();
        PageInfo<ShopRecommend> pageInfo = new PageInfo<>(list);
        return result.ok("成功",pageInfo);
    }

    @Override
    public Result deleteShopRecommend(Integer recommendId) {
        Result result = new Result();
        shopRecommendMapper.deleteShopRecommend(recommendId);
        ShopRecommend shopRecommend = shopRecommendMapper.getShopRecommend(recommendId);
        if(shopRecommend == null){
            return result.ok("删除成功",shopRecommend);
        }
        return result.error("删除失败");
    }

    @Override
    public Result getShopRecommend(Integer recommendId) {
        Result result = new Result();
        ShopRecommend shopRecommend = shopRecommendMapper.getShopRecommend(recommendId);
        if(shopRecommend == null){
            return result.error("该商品不存在");
        }
        return result.ok("查询成功",shopRecommend);
    }

    @Override
    public Result insertShopRecommend(ShopRecommend shopRecommend) {
        Result result = new Result();
        Integer recommendId = Integer.valueOf(shopRecommend.getRecommendId());
        shopRecommendMapper.insertShopRecommend(shopRecommend);
        ShopRecommend shopRecommend1 = shopRecommendMapper.getShopRecommend(recommendId);
        if(shopRecommend1 == null){
            return result.error("添加失败");
        }

        return result.ok("添加成功",shopRecommend1);
    }
}

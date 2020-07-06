package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.bean.ShopRecommend;
import com.example.market.service.ShopRecommendServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/shopRecommend")
public class ShopRecommendController {
    @Autowired
    ShopRecommendServiceImpl shopRecommendService;

    @ApiOperation(value = "显示所有推荐的商品信息", notes = "无参数")
    @ResponseBody
    @RequestMapping(value = "/getShopRecommendList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getShopRecommendList(@RequestBody HashMap<String, Integer> map){
        Integer pageNum = map.get("pageNum");
        return shopRecommendService.getShopRecommendList(pageNum);
    }

    @ApiOperation(value = "删除推荐的商品信息", notes = "参数:recommend")
    @ResponseBody
    @RequestMapping(value = "/deleteShopRecommend", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result deleteShopRecommend(@RequestBody HashMap<String,Integer>map){
        Integer recommendId = map.get("recommendId");
        return shopRecommendService.deleteShopRecommend(recommendId);
    }

    @ApiOperation(value = "添加推荐的商品信息", notes = "对象参数:ShopRecommend")
    @ResponseBody
    @RequestMapping(value = "/insertShopRecommend", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result insertShopRecommend(@RequestBody ShopRecommend shopRecommend){
        return shopRecommendService.insertShopRecommend(shopRecommend);
    }

    @ApiOperation(value = "查询推荐的商品信息", notes = "参数:recommendId")
    @ResponseBody
    @RequestMapping(value = "/getShopRecommend", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result insertShopRecommend(@RequestBody Integer recommendId){
        return shopRecommendService.getShopRecommend(recommendId);
    }

}

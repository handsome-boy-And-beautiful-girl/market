package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.bean.Shop;
import com.example.market.service.ShopServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopServiceImpl shopService;


    @ResponseBody
    @ApiOperation(value = "查询所有商品信息", notes = "无需产参数")
    @RequestMapping(value = "/getShopList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getShopList() {
        return shopService.getShopList();
    }

    @ResponseBody
    @ApiOperation(value = "查询商品信息",notes = "单个参数:shopName")
    @RequestMapping(value = "/getShop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getShop(@RequestBody HashMap<String,String>map) {
        String shopName= map.get("shopName");
        return shopService.getShop(shopName);
    }

    @ResponseBody
    @ApiOperation(value = "添加商品",notes = "对象参数:shop实体")
    @RequestMapping(value = "/insertShop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result insertShop(@RequestBody Shop shop) {
        return shopService.insertShop(shop);
    }

    @ResponseBody
    @ApiOperation(value = "修改商品信息",notes = "对象参数:shop实体")
    @RequestMapping(value = "/updateShop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result updateShop(@RequestBody  Shop shop) {
        return shopService.updateShop(shop);
    }


}

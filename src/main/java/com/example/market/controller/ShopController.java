package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.bean.Shop;
import com.example.market.service.ShopServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Random;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopServiceImpl shopService;


    @ResponseBody
    @ApiOperation(value = "查询所有商品信息", notes = "无需产参数")
    @RequestMapping(value = "/getShopList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getShopList(@RequestBody HashMap<String,Integer>map) {
        Integer pageNum = map.get("pageNum");
        return shopService.getShopList(pageNum);
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
        String Number = "S";
        for (int i=0;i<10;i++){
            Number += (int)Math.random()*9;
        }
        System.out.println(Number);
        shop.setShopNumber(Number);
        return shopService.insertShop(shop);
    }

    @ResponseBody
    @ApiOperation(value = "修改商品信息",notes = "对象参数:shop实体")
    @RequestMapping(value = "/updateShop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result updateShop(@RequestBody  Shop shop) {
        return shopService.updateShop(shop);
    }


    @ResponseBody
    @ApiOperation(value = "删除商品信息",notes = "参数: id")
    @RequestMapping(value = "/deleteShop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result delete(@RequestBody HashMap<String,Integer> map){
        Integer id = map.get("id");
        System.out.println(id);
        return shopService.deleteShop(id);
    }
}

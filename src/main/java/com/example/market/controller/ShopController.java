package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.bean.Shop;
import com.example.market.service.ShopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopServiceImpl shopService;


    @ResponseBody
    @RequestMapping(value = "/getShopList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getShopList() {
        return shopService.getShopList();
    }

    @ResponseBody
    @RequestMapping(value = "/getShop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getShop(@RequestBody HashMap<String,String>map) {
        String shopName= map.get("shopName");
        return shopService.getShop(shopName);
    }

    @ResponseBody
    @RequestMapping(value = "/insertShop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result insertShop(@RequestBody Shop shop) {
        return shopService.insertShop(shop);
    }

    @ResponseBody
    @RequestMapping(value = "/updateShop", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result updateShop(@RequestBody  Shop shop) {
        return shopService.updateShop(shop);
    }


}

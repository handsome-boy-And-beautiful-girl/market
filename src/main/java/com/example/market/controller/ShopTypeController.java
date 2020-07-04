package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.bean.ShopType;
import com.example.market.service.ShopTypeServiceImpl;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/shopType")
public class ShopTypeController {
    @Autowired
    ShopTypeServiceImpl shopTypeService;

    @ApiOperation(value = "显示所有商品类别", notes = "不用参数")
    @ResponseBody
    @RequestMapping(value = "/getShopTypeList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getShopTypeList(){
        return shopTypeService.getShopTypeList();
    }

    @ApiOperation(value = "查询类别", notes = "单参数：typeName")
    @ResponseBody
    @RequestMapping(value = "/getShopType", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getShopType(@RequestBody String typeName){
        return shopTypeService.getShopType(typeName);
    }

    @ApiOperation(value = "商品类删除", notes = "双参数：typeId,TypeName")
    @ResponseBody
    @RequestMapping(value = "/deleteShopType", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result deleteShopType(@RequestBody HashMap<String,String>map){
        String typeName = map.get("typeName");
        Integer typeId = Integer.valueOf(map.get("typeId"));
        return shopTypeService.deleteShopType(typeId,typeName);
    }

    @ApiOperation(value = "商品类别添加", notes = "对象参数：shopType")
    @ResponseBody
    @RequestMapping(value = "/insertShopType", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result insertShopType(@RequestBody ShopType shopType){
        return shopTypeService.insertShopType(shopType);
    }

    @ApiOperation(value = "商品类别信息修改", notes = "对象参数：shopType")
    @ResponseBody
    @RequestMapping(value = "/updateShopType", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result updateShopType(@RequestBody ShopType shopType){
        return shopTypeService.updateShopType(shopType);
    }




}

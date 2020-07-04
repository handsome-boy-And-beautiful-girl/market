package com.example.market.controller;


import com.example.market.bean.Result;
import com.example.market.bean.ShoppingCart;
import com.example.market.service.ShoppingCartServiceImpl;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping(value = "shoppingCart")
public class ShoppingCartController {
    @Autowired
    ShoppingCartServiceImpl shoppingCartService;

    @ApiOperation(value = "显示购物车所有商品", notes = "单参数：userPhone")
    @ResponseBody
    @RequestMapping(value = "/getCartList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result getCartList(@RequestBody String userPhone){
        return shoppingCartService.getCartList(userPhone);
    }

    @ApiOperation(value = "删除购物车单个商品信息", notes = "单参数：cartId")
    @ResponseBody
    @RequestMapping(value = "/deleteCart", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result deleteCart(@RequestBody Integer cartId){
        return shoppingCartService.deleteCart(cartId);
    }

    @ApiOperation(value = "添加商品信息到购物车", notes = "对象参数：shoppingCart")
    @ResponseBody
    @RequestMapping(value = "/insertShoppingCart", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public Result insertShoppingCart(@RequestBody ShoppingCart shoppingCart){
        return shoppingCartService.insertShoppingCart(shoppingCart);
    }
}

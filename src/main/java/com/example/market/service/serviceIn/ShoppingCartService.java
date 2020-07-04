package com.example.market.service.serviceIn;

import com.example.market.bean.Result;
import com.example.market.bean.ShoppingCart;

import java.util.List;

// 购物车
public interface ShoppingCartService {
    // 显示用户所有购物车中的信息
    Result getCartList(String userPhone);

    // 删除购物车中的商品信息
    Result deleteCart(Integer cartId);

    //cartId 查询购物车中信息
    Result selectCart(Integer cartId);

    // 商品添加到购物车
    Result insertShoppingCart(ShoppingCart shoppingCart);
}

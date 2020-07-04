package com.example.market.Dao;


import com.example.market.bean.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

// 购物车
@Mapper
public interface ShoppingCartMapper {

    // 显示用户所有购物车中的信息
    List<ShoppingCart> getCartList(String userPhone);

    // 删除购物车中的商品信息
    void deleteCart(Integer cartId);

    //查找用户购物车中个人单个商品信息
    ShoppingCart selectCartShopName(Integer shopId,String userPhone);

    //cartId 查询购物车中信息
    ShoppingCart selectCart(Integer cartId);

    // 商品添加到购物车
    void insertShoppingCart(ShoppingCart shoppingCart);
}

package com.example.market.service;


import com.example.market.Dao.ShoppingCartMapper;
import com.example.market.bean.Result;
import com.example.market.bean.Shop;
import com.example.market.bean.ShoppingCart;
import com.example.market.service.serviceIn.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService {
    @Autowired
    ShoppingCartMapper shoppingCartMapper;

    @Override
    public Result getCartList(String userPhone) {
        Result result = new Result();
        List<ShoppingCart> list = shoppingCartMapper.getCartList(userPhone);
        return result.ok("成功",list);
    }

    @Override
    public Result deleteCart(Integer cartId) {
        Result result = new Result();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCartMapper.deleteCart(cartId);
        shoppingCart = shoppingCartMapper.selectCart(cartId);
        if(shoppingCart == null){
            return result.ok("删除成功",null);
        }
        return result.error("删除失败");
    }

    @Override
    public Result selectCart(Integer cartId) {
        Result result = new Result();
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart = shoppingCartMapper.selectCart(cartId);
        if(shoppingCart == null){
            return result.error("查询失败");
        }
        return result.ok("查询成功",shoppingCart);
    }

    @Override
    public Result insertShoppingCart(ShoppingCart shoppingCart) {
        Result result = new Result();
        String userPhone = shoppingCart.getUserPhone();
        Integer shopId = shoppingCart.getShopId();
        ShoppingCart shoppingCart1 = new ShoppingCart();
        shoppingCartMapper.insertShoppingCart(shoppingCart);
        shoppingCart1 = shoppingCartMapper.selectCartShopName(shopId,userPhone);
        if(shoppingCart1 == null){
            return  result.error("添加失败");
        }
        return result.ok("添加成功",shoppingCart1);
    }
}

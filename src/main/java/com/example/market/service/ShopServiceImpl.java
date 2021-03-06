package com.example.market.service;


import com.example.market.Dao.ShopMapper;
import com.example.market.bean.Result;
import com.example.market.bean.Shop;
import com.example.market.service.serviceIn.ShopService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    ShopMapper shopMapper;


    @Override
    public Result getShopList(Integer pageNum) {
        Result result = new Result();
        PageHelper.startPage(pageNum,10);
        List<Shop> list = shopMapper.getShopList();
        PageInfo<Shop> pageInfo = new PageInfo<>(list);
//        System.out.println(list);
//        System.out.println(pageInfo);
        return  result.ok("成功",pageInfo);
    }

    @Override
    public Result getShop(String shopName) {
        System.out.println(shopName);
        Result result = new Result();
        Shop shop = shopMapper.getShop(shopName);
        System.out.println(shop.toString());
        if(shop == null){
            return result.error("未查询到该商品");
        }
        return result.ok("成功",shop);
    }

    @Override
    public Result insertShop(Shop shop) {
        System.out.println(shop.toString());
        Result result = new Result();
        String shopName = shop.getShopName();
        shopMapper.insertShop(shop);
        Shop shop1 = shopMapper.getShop(shopName);
        if(shop1 == null){
            return result.error("添加失败");
        }
        return result.ok("添加成功",shop1);
    }

    @Override
    public Result updateShop(Shop shop) {
        Result result = new Result();
        String shopName = shop.getShopName();
        shopMapper.updateShop(shop);
        return  result.ok("修改成功",shopMapper.getShop(shopName));
    }

    @Override
    public Result deleteShop(Integer id) {
        Result result = new Result();
        shopMapper.deleteShop(id);
        return result.ok("成功删除",null);
    }
}

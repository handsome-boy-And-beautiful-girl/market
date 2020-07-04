package com.example.market.service;

import com.example.market.Dao.ShopTypeMapper;
import com.example.market.bean.Result;
import com.example.market.bean.Shop;
import com.example.market.bean.ShopType;
import com.example.market.service.serviceIn.ShopTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopTypeServiceImpl implements ShopTypeService {
    @Autowired
    ShopTypeMapper shopTypeMapper;

    @Override
    public Result getShopTypeList() {
        Result result = new Result();
        List<ShopType>list = shopTypeMapper.getShopTypeList();
        return result.ok("成功",list);
    }

    @Override
    public Result getShopType(String typeName) {
        Result result = new Result();
        ShopType shopType = new ShopType();
        shopType = shopTypeMapper.getShopType(typeName);
        if(shopType == null){
            return result.error("商品类别查询失败");
        }
        return result.ok("查询成功",shopType);
    }

    @Override
    public Result deleteShopType(Integer typeId, String typeName) {
        Result result = new Result();
        shopTypeMapper.deleteShopType(typeId,typeName);
        ShopType shopType = shopTypeMapper.getShopType(typeName);
        if(shopType == null){
            return result.ok("删除成功",null);
        }
        return result.error("删除失败");
    }

    @Override
    public Result insertShopType(ShopType shopType) {
        Result result =  new Result();
        String typeName = shopType.getTypeName();
        ShopType shopType1 = shopTypeMapper.getShopType(typeName);
        if(shopType1 !=null){
            return result.error("类别存在");
        }
        shopTypeMapper.insertShopType(shopType);
        shopType1 = shopTypeMapper.getShopType(typeName);
        return result.ok("添加类别成功",shopType1);
    }

    @Override
    public Result updateShopType(ShopType shopType) {
        Result result = new Result();
        String typeName = shopType.getTypeName();
        shopTypeMapper.updateShopType(shopType);
        ShopType shopType1 = shopTypeMapper.getShopType(typeName);
        return result.ok("成功",shopType1);
    }
}

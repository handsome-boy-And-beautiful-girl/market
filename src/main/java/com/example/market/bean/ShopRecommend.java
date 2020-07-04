package com.example.market.bean;

import java.io.Serializable;

public class ShopRecommend implements Serializable {
    private int recommendId;
    private int shopId;
    private String shopName;
    private String shopNo;
    private String shopImage;
    private String description;
    private int price;
    private int shopCount;
    private int typeId;
    private String typeName;

    @Override
    public String toString() {
        return "ShopRecommend{" +
                "recommendId=" + recommendId +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", shopImage='" + shopImage + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", shopCount=" + shopCount +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                '}';
    }

    public int getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(int recommendId) {
        this.recommendId = recommendId;
    }

    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getShopCount() {
        return shopCount;
    }

    public void setShopCount(int shopCount) {
        this.shopCount = shopCount;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ShopRecommend(int recommendId, int shopId, String shopName, String shopNo, String shopImage, String description, int price, int shopCount, int typeId, String typeName) {
        this.recommendId = recommendId;
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopNo = shopNo;
        this.shopImage = shopImage;
        this.description = description;
        this.price = price;
        this.shopCount = shopCount;
        this.typeId = typeId;
        this.typeName = typeName;
    }
}

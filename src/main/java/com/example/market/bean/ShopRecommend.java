package com.example.market.bean;

import java.io.Serializable;

public class ShopRecommend implements Serializable {
    private int recommendId;
    private int shopId;
    private String shopName;
    private String shopNumber;
    private String shopImage;
    private String summarize;
    private double price;
    private int quantity;
    private int typeId;
    private String category;

    public ShopRecommend(){
        super();
    }

    public ShopRecommend(int recommendId, int shopId, String shopName, String shopNumber, String shopImage, String summarize, int price, int quantity, int typeId, String category) {
        this.recommendId = recommendId;
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopNumber = shopNumber;
        this.shopImage = shopImage;
        this.summarize = summarize;
        this.price = price;
        this.quantity = quantity;
        this.typeId = typeId;
        this.category = category;
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

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ShopRecommend{" +
                "recommendId=" + recommendId +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopNumber='" + shopNumber + '\'' +
                ", shopImage='" + shopImage + '\'' +
                ", summarize='" + summarize + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", typeId=" + typeId +
                ", category='" + category + '\'' +
                '}';
    }
}

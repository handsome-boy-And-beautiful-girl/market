package com.example.market.bean;

import java.io.Serializable;

public class Shop implements Serializable {
    private Integer id;
    private String shopName;
    private String ShopNumber;
    private String shopImg;
    private String summarize;
    private String category;
    private double price;
    private String quantity;

    public Shop(){
        super();
    }

    public Shop(Integer id, String shopName, String shopNumber, String shopImg, String summarize, String category, double price, String quantity) {
        this.id = id;
        this.shopName = shopName;
        ShopNumber = shopNumber;
        this.shopImg = shopImg;
        this.summarize = summarize;
        this.category = category;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNumber() {
        return ShopNumber;
    }

    public void setShopNumber(String shopNumber) {
        ShopNumber = shopNumber;
    }

    public String getShopImg() {
        return shopImg;
    }

    public void setShopImg(String shopImg) {
        this.shopImg = shopImg;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", ShopNumber='" + ShopNumber + '\'' +
                ", shopImg='" + shopImg + '\'' +
                ", summarize='" + summarize + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}

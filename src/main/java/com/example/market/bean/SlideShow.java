package com.example.market.bean;

import java.io.Serializable;

public class SlideShow implements Serializable {
    private int imageId;
    private int shopId;
    private String shopName;
    private String shopImage;
    private String description;
    private int price;
    private int shopCount;
    private int typeId;
    private String typeName;
    private String shopNo;

    @Override
    public String toString() {
        return "SlideShow{" +
                "imageId=" + imageId +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopImage='" + shopImage + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", shopCount=" + shopCount +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                '}';
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
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

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public SlideShow(int imageId, int shopId, String shopName, String shopImage, String description, int price, int shopCount, int typeId, String typeName, String shopNo) {
        this.imageId = imageId;
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopImage = shopImage;
        this.description = description;
        this.price = price;
        this.shopCount = shopCount;
        this.typeId = typeId;
        this.typeName = typeName;
        this.shopNo = shopNo;
    }
}

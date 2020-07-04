package com.example.market.bean;

import java.io.Serializable;

public class SlideShow implements Serializable {
    private int typeId;
    private String typeName;
    private String typeImage;
    private int shopId;
    private String shopName;

    public SlideShow(int typeId, String typeName, String typeImage, int shopId, String shopName) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeImage = typeImage;
        this.shopId = shopId;
        this.shopName = shopName;
    }

    @Override
    public String toString() {
        return "SlideShow{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", typeImage='" + typeImage + '\'' +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                '}';
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

    public String getTypeImage() {
        return typeImage;
    }

    public void setTypeImage(String typeImage) {
        this.typeImage = typeImage;
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
}

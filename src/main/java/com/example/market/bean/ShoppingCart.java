package com.example.market.bean;

import java.io.Serializable;

public class ShoppingCart implements Serializable {
    private int cartId;
    private int userID;
    private String userPhone;
    private int shopId;
    private String shopName;
    private String shopImage;
    private int price;
    private String description;

    public ShoppingCart(){
        super();
    }

    public ShoppingCart(int cartId, int userID, String userPhone, int shopId, String shopName, String shopImage, int price, String description) {
        this.cartId = cartId;
        this.userID = userID;
        this.userPhone = userPhone;
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopImage = shopImage;
        this.price = price;
        this.description = description;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "cartId=" + cartId +
                ", userID=" + userID +
                ", userPhone='" + userPhone + '\'' +
                ", shopId=" + shopId +
                ", shopName='" + shopName + '\'' +
                ", shopImage='" + shopImage + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

}

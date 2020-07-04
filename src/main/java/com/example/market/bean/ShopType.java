package com.example.market.bean;

import java.io.Serializable;

public class ShopType implements Serializable {
    private int typeId;
    private String typeName;
    private String typeIcon;

    public ShopType(int typeId, String typeName, String typeIcon) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.typeIcon = typeIcon;
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

    public String getTypeIcon() {
        return typeIcon;
    }

    public void setTypeIcon(String typeIcon) {
        this.typeIcon = typeIcon;
    }

    @Override
    public String toString() {
        return "ShopType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", typeIcon='" + typeIcon + '\'' +
                '}';
    }
}

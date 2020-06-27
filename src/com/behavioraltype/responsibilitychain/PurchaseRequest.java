package com.behavioraltype.responsibilitychain;

public class PurchaseRequest {

    float price;//价格

    int  type;//类型

    public PurchaseRequest(float price, int type) {
        this.price = price;
        this.type = type;
    }

    public float getPrice() {
        return price;
    }

    public int getType() {
        return type;
    }
}

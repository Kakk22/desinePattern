package com.cyf.designPattern.decorator;

public abstract class Drink {
    private String description="";//饮料的具体描述
    private float price = 0.0f;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public abstract float cost();//计算价格抽象方法 具体价格具体类实现
}

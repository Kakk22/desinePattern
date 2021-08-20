package com.cyf.designPattern.decorator;

public class Milk extends  Decorator {

    public Milk(Drink obj) {
        super(obj);
        setDescription("milk");
        setPrice(1.5f);
    }
}

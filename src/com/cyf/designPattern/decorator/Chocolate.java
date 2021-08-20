package com.cyf.designPattern.decorator;

public class Chocolate extends Decorator {

    public Chocolate(Drink obj) {
        super(obj);
        setDescription("巧克力");
        setPrice(2.0f);
    }
}

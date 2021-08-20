package com.cyf.designPattern.factory.simpleFactory;

public class FruitFactory {
    public Fruit creatFruit(String type) {
        System.out.println("======FruitFactory creatFruit====");
        if (type.equals("apple")) {
            return new Apple();
        } else if (type.equals("pear")) {
            return new Pear();
        }
        return null;
    }
}

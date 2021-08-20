package com.cyf.designPattern.factory.simpleFactory;

public class simpleFactory {
    public static void main(String[] args) {
        FruitFactory fruitFactory = new FruitFactory();
        Fruit apple = fruitFactory.creatFruit("apple");//获得苹果
        apple.getName();
        Fruit pear = fruitFactory.creatFruit("pear");//获得梨
        pear.getName();

    }
}

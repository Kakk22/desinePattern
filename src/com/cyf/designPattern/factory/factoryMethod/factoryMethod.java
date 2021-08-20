package com.cyf.designPattern.factory.factoryMethod;

import com.cyf.designPattern.factory.factoryMethod.fruit.Fruit;

public class factoryMethod {
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();//苹果工厂生产苹果
        Fruit apple = appleFactory.creatFruit();
        apple.getName();
        PearFactory pearFactory = new PearFactory();//梨工厂生产梨
        Fruit pear = pearFactory.creatFruit();
        pear.getName();
    }
}

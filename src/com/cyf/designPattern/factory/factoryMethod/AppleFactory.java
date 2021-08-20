package com.cyf.designPattern.factory.factoryMethod;

import com.cyf.designPattern.factory.factoryMethod.fruit.Apple;
import com.cyf.designPattern.factory.factoryMethod.fruit.Fruit;

public class AppleFactory extends FruitFactory {
    @Override
    public Fruit creatFruit() {
        return new Apple();
    }
}

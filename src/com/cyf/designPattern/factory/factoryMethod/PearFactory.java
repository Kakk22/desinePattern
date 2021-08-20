package com.cyf.designPattern.factory.factoryMethod;

import com.cyf.designPattern.factory.factoryMethod.fruit.Fruit;
import com.cyf.designPattern.factory.factoryMethod.fruit.Pear;

public class PearFactory extends FruitFactory {
    @Override
    public Fruit creatFruit() {
        return new Pear();
    }
}

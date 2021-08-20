package com.cyf.designPattern.factory.abstractFactory;

public abstract class Screen {
    public abstract void isScreen();
}

class LCD extends Screen{
    @Override
    public void isScreen() {
        System.out.println("LCD");
    }
}

class OLCD extends Screen{
    @Override
    public void isScreen() {
        System.out.println("OLCD");
    }
}

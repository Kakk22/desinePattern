package com.cyf.designPattern.factory.abstractFactory;



public class Iphone8Factory implements PhoneFactory {
    @Override
    public Cpu getCpu() {
        return new A11();
    }

    @Override
    public Screen getScreen() {
        return new OLCD();
    }
}

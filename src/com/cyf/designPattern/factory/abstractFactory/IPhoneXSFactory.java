package com.cyf.designPattern.factory.abstractFactory;



public class IPhoneXSFactory implements  PhoneFactory {
    @Override
    public Cpu getCpu() {
        return new A12();
    }

    @Override
    public Screen getScreen() {
        return new LCD();
    }
}

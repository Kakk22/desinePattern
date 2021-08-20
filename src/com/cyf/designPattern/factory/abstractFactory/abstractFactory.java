package com.cyf.designPattern.factory.abstractFactory;

public class abstractFactory {
    public static void main(String[] args) {
        Iphone8Factory iphone8Factory = new Iphone8Factory();
        IPhoneXSFactory iPhoneXSFactory = new IPhoneXSFactory();
        System.out.println("========iphone8Factory==========");
        Cpu cpuA11 = iphone8Factory.getCpu();
        Screen screen = iphone8Factory.getScreen();
        cpuA11.run();
        screen.isScreen();
        System.out.println("========iPhoneXSFactory==========");
        Cpu cpuA12 = iPhoneXSFactory.getCpu();
        Screen screen1 = iPhoneXSFactory.getScreen();
        cpuA12.run();
        screen1.isScreen();
    }
}

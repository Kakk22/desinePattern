package com.cyf.designPattern.factory.abstractFactory;

public abstract class Cpu {
    public abstract void run();
}

class A11 extends Cpu{
    @Override
    public void run() {
        System.out.println("A11");
    }
}

class A12 extends  Cpu{
    @Override
    public void run() {
        System.out.println("A12");
    }
}
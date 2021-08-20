package com.cyf.designPattern.proxy;

public class TeachDao implements ITeachDao {
    @Override
    public void teach() {
        System.out.println("teach.....");
    }
}

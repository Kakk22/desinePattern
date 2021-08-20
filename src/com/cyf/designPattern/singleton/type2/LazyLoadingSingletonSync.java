package com.cyf.designPattern.singleton.type2;

public class LazyLoadingSingletonSync {
}
class Singleton1{
    //将自己实例化对象设置为一个属性，用static
    private static Singleton1 instance;
    //构造方法私有化
    private Singleton1(){}

    //静态方法返回实例，方法加synchronized 关键字
    public static synchronized Singleton1 getInstance(){
        if (instance==null){
            //线程在这里被阻塞，则对象没别创建，不安全
            instance = new Singleton1();
        }
        return instance;
    }
}
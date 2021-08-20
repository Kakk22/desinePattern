package com.cyf.designPattern.singleton.type1;


public class Singleton01 {
    public static void main(String[] args) {
    }
}

/**
 * 懒汉单例  静态常量
 */
class Singleton{
    //构造器私有化
    private Singleton(){
    }
    //类加载时实例化
    private final static Singleton instance = new Singleton();
    //对外提供静态方法
    public static Singleton getInstance(){
        return instance;
    }
}

//懒汉静态代码块
class Singleton1{
    private static Singleton1 instance;
    private Singleton1(){
    }
    static {
         instance = new Singleton1();
    }
    public static Singleton1 getInstance(){
        return instance;
    }
}

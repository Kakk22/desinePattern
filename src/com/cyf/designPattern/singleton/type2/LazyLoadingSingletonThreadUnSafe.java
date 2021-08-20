package com.cyf.designPattern.singleton.type2;

public class LazyLoadingSingletonThreadUnSafe {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1==singleton2);//true
    }
}
//懒汉单例 线程不安全
class Singleton{
    //将自己实例化对象设置为一个属性，用static
    private static Singleton instance;
    //构造方法私有化
    private Singleton(){}

    //静态方法返回实例
    public static Singleton getInstance(){
        if (instance==null){
            //线程在这里被阻塞，则对象没别创建，不安全
            instance = new Singleton();
        }
        return instance;
    }
}
package com.cyf.designPattern.singleton.type4;



public class StaticInternalSingleton {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance==instance1);
    }
}
class Singleton{
    private Singleton(){}

    public static Singleton getInstance(){
        return SingleHolder.INSTANCE;
    }
    //静态的内部类
    private static class SingleHolder{
        //加载 Singleton 类时并不会加载内部类
        private static final Singleton INSTANCE = new Singleton();
    }
}
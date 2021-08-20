package com.cyf.designPattern.proxy;

public class Client {
    public static void main(String[] args) {
        //创建目标，被代理对象
        ITeachDao teachDao = new TeachDao();
        //给目标对象创建代理对象
        ProxyFactory proxyFactory = new ProxyFactory(teachDao);
        //返回用接口接收，因为只有接口才能保证代理对象和目标对象方法一致
        ITeachDao instance = (ITeachDao) proxyFactory.getInstance();
        instance.teach();

    }
}

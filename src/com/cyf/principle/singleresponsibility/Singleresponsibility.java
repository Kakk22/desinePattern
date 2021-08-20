package com.cyf.principle.singleresponsibility;

/**
 * 只有类中方法数量足够少，可以在方法级别保持单一职责原则
 */
public class Singleresponsibility {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("跑跑卡丁车");
        vehicle.fly("直升飞机");
    }
}

//交通工具类
// 逻辑简单，方法级别实现单一职责
// 逻辑复杂，分类实现单一职责
class Vehicle{
    public void run(String vehicle){
        System.out.println(vehicle+"在陆地上跑");
    }
    public void fly(String vehicle){
        System.out.println(vehicle+"在天空上飞");
    }
}


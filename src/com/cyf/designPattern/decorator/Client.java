package com.cyf.designPattern.decorator;

public class Client {
    public static void main(String[] args) {
        Drink order = new LongBlack();

        order = new Chocolate(order);
        System.out.println("费用：" + order.cost());
        System.out.println("描述：" + order.getDescription());
        order = new Milk(order);
        System.out.println("费用：咖啡+巧克力+牛奶" + order.cost());
        System.out.println("描述：" + order.getDescription());

    }
}

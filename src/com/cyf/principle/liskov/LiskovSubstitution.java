package com.cyf.principle.liskov;

public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("9-2="+a.fun1(9,2));
        B b = new B();
        System.out.println("9+2="+b.fun1(9,2));
        System.out.println("2+1+9=" + b.fun2(2, 1));
        System.out.println("B类使用A类方法：2-1=" + b.fun3(2, 1));
    }
}

class Base {
    //把基础方法和成员抽取成基类
    public int fun1(int num1,int num2){
        return num1-num2;
    }
}


class A extends Base{
}

class B extends Base{
    private A a = new A();//使用组合关系，B调用A类方法 而不用继承

    public int fun1(int num1,int num2){
        return num1+num2;
    }

    public int fun2(int num1,int num2){
        return fun1(num1,num2)+9;
    }

    public int fun3(int num1,int num2){
        return a.fun1(num1,num2);
    }
}

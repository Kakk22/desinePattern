package com.cyf.principle.segregation;

public class Segregation {
    public static void main(String[] args) {
        A a = new A();
        a.depent1(new B());//A依赖B
        a.depent2(new B());
        a.depent3(new B());
        C c = new C();
        c.depent1(new D());//C依赖D
        c.depent2(new D());
        c.depent3(new D());
    }
}

interface interface1{
    void operation1();
}

interface interface2{
    void operation2();
    void operation3();
}

interface interface3{
    void operation4();
    void operation5();
}

class B implements interface1,interface2{

    @Override
    public void operation1() {
        System.out.println("b实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("b实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("b实现了operation3");
    }
}

class D implements interface1,interface3{
    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5");
    }
}

class A{
    void depent1(interface1 i){
        i.operation1();
    }
    void depent2(interface2 i){
        i.operation2();
    }
    void depent3(interface2 i){
        i.operation3();
    }
}
class C{
    void depent1(interface1 i){
        i.operation1();
    }
    void depent2(interface3 i){
        i.operation4();
    }
    void depent3(interface3 i){
        i.operation5();
    }
}
package com.cyf.designPattern.decorator;
//装饰者
public class Decorator extends Drink {
    private Drink obj;

    public Decorator(Drink obj){//j通过聚合关系
        this.obj=obj;
    }

    @Override
    public float cost() {
        //自己的价格 加上被装饰者的价格
        return super.getPrice()+obj.cost();
    }

    @Override
    public String getDescription() {
        //装饰着的描述+装饰者的价格+被装饰者的描述
        return super.getDescription()+" "+super.getPrice()+" &&"+obj.getDescription();
    }
}

package com.cyf.principle.ocp;

//开闭原则
public class Ocp {
    public static void main(String[] args) {
        Use use = new Use();
        use.drawShape(new Triangle());
        use.drawShape(new Circle());
        use.drawShape(new OtherGraphics());
    }
}


class Use{
    public void drawShape(Shape shape){
        shape.draw();
    }
}

abstract class  Shape{
    public abstract void draw();
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class  Circle extends  Shape{
    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
class OtherGraphics extends Shape {

    @Override
    public void draw() {
        System.out.println("子类实现具体功能：任何形状");
    }
}

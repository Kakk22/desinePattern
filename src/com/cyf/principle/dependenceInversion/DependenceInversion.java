package com.cyf.principle.dependenceInversion;

//依赖倒转原则
public class DependenceInversion {
    public static void main(String[] args) {
        persion persion = new persion();
        persion.receve(new Email());
        persion.receve(new Wechat());
    }
}

interface IRecever{
    String getInfo();
}

class Email implements IRecever{

    @Override
    public String getInfo() {
        return "email:helloworld";
    }
}
class Wechat implements IRecever{

    @Override
    public String getInfo() {
        return "Wechat:helloworld";
    }
}



//模拟人收到消息
class persion{
    //接受类型为接口
    public void receve(IRecever recever){
        String info = recever.getInfo();
        System.out.println(info);
    }
}
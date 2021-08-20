package com.cyf.designPattern.chain;

/**
 * @author chenyifeng
 */
public class Client {

    public static void main(String[] args) {
        //调用客户端,具体业务场景时可以使用spring组装
        CreateOrderChain createOrderChain = new CreateOrderChain();
        ParamsCheckHandler paramsCheckHandler = new ParamsCheckHandler();
        BusinessCheckHandler businessCheckHandler = new BusinessCheckHandler();
        createOrderChain.addChain(paramsCheckHandler);
        createOrderChain.addChain(businessCheckHandler);

        OrderDto orderDto = new OrderDto();
        //请求创建订单 校验
        createOrderChain.doHandler(orderDto);
        //如果通过继续执行业务逻辑
        System.out.println("校验通过,开始创建订单。。");

    }
}

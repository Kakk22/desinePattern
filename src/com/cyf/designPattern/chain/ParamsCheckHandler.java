package com.cyf.designPattern.chain;

/**
 * 创建订单参数校验
 *
 * @author chenyifeng
 */
public class ParamsCheckHandler implements OrderHandler<OrderDto> {

    @Override
    public boolean doHandle(OrderDto order) {
        System.out.println("开始进行订单参数校验");
        return false;
    }
}

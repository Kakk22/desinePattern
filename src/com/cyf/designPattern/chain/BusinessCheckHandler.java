package com.cyf.designPattern.chain;


/**
 * 业务校验1
 *
 * @author chenyifeng
 */
public class BusinessCheckHandler implements OrderHandler<OrderDto> {

    @Override
    public boolean doHandle(OrderDto order) {
        System.out.println("开始业务校验1");
        return true;
    }
}

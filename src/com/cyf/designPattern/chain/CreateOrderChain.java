package com.cyf.designPattern.chain;

import java.util.LinkedList;

/**
 * 创建订单责任链
 *
 * @author cyf
 */
public class CreateOrderChain {

    private final LinkedList<OrderHandler<OrderDto>> chain = new LinkedList<>();

    public void addChain(OrderHandler<OrderDto> handler) {
        chain.addLast(handler);
    }

    public boolean doHandler(OrderDto orderDto) {
        for (OrderHandler<OrderDto> orderDtoOrderHandler : chain) {
            boolean result = orderDtoOrderHandler.doHandle(orderDto);
            if (result) {
                return false;
            }
        }
        return true;
    }
}

package com.cyf.designPattern.chain;

/**
 * @author chenyifeng
 */
public interface OrderHandler<T> {

    /**
     * 具体执行逻辑
     *
     * @param order 订单信息
     * @return /
     */
    boolean doHandle(T order);
}

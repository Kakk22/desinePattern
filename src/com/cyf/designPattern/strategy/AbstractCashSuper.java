package com.cyf.designPattern.strategy;

/**
 * @author by cyf
 * @date 2020/11/30.
 */
public abstract class AbstractCashSuper {

    /**
     * 抽象方法 由子类具体实现具体价格策略(打折、满减等)
     * @param money 钱
     * @return 具体策略后应付款的价格
     */
    public abstract double acceptCash(double money);
}

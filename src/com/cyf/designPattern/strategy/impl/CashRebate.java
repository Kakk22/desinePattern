package com.cyf.designPattern.strategy.impl;

import com.cyf.designPattern.strategy.AbstractCashSuper;

/**
 * @author by cyf
 * @date 2020/11/30.
 */
public class CashRebate extends AbstractCashSuper {
    /**
     *  折扣
     */
    private double moneyRebate = 0.8;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}

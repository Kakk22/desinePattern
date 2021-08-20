package com.cyf.designPattern.strategy.impl;

import com.cyf.designPattern.strategy.AbstractCashSuper;

/**
 * 满减类
 *
 * @author by cyf
 * @date 2020/11/30.
 */
public class CashReturn extends AbstractCashSuper {
    /**
     * 返利条件
     */
    private double moneyCondition = 0.0;
    /**
     * 返利值
     */
    private double moneyReturn = 0.0d;

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        if (money >= moneyCondition) {
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        } else {
            return money;
        }
    }
}

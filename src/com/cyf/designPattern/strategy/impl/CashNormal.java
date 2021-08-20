package com.cyf.designPattern.strategy.impl;

import com.cyf.designPattern.strategy.AbstractCashSuper;

/**
 * 正常收费
 *
 * @author by cyf
 * @date 2020/11/30.
 */
public class CashNormal extends AbstractCashSuper {


    @Override
    public double acceptCash(double money) {
        return money;
    }

}

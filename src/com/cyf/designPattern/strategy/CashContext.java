package com.cyf.designPattern.strategy;

/**
 * 现金收费抽象类
 *
 * @author by cyf
 * @date 2020/11/30.
 */
public class CashContext {

    private AbstractCashSuper abstractCashSuper;

    public CashContext(AbstractCashSuper abstractCashSuper) {
        this.abstractCashSuper = abstractCashSuper;
    }

    public double getResult(double money) {
        return abstractCashSuper.acceptCash(money);
    }
}

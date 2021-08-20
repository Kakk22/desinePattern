package com.cyf.designPattern.adapter.objectAdapter;

public class Phone {
    public void charging(IVoltage5V iVoltage5V) {
        int i = iVoltage5V.output5V();
        if (i == 5) {
            System.out.println("5V电压正在充电");
        } else if (i > 5) {
            System.out.println("电压大于5V，无法充电");
        }
    }
}

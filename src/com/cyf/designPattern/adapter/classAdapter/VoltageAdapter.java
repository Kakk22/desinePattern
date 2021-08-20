package com.cyf.designPattern.adapter.classAdapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {
    @Override
    public int output5V() {
        System.out.println("适配器适配电压");
        int srcV = output220V();
        int dscV = srcV/44;
        System.out.println("适配后的电压为"+dscV+"V");
        return dscV;
    }
}

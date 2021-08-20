package com.cyf.designPattern.adapter.objectAdapter;

public class VoltageAdapter implements IVoltage5V {
    //不使用继承 使用聚合
    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dscV = 0;
        if (voltage220V != null) {
            System.out.println("适配器适配电压");
            int srcV = voltage220V.output220V();
            dscV = srcV / 44;
            System.out.println("适配后的电压为" + dscV + "V");
            return dscV;
        }
        return dscV;
    }
}

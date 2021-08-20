package com.cyf.designPattern.observer;

public class CurrentConditions implements Observer {
    private float temperature;
    private float pressure;
    private float humidity;

    //更新数据
    @Override
    public void update(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        dispaly();
    }
    //展示数据
    private void dispaly() {
        System.out.println("============CurrentConditions data==========");
        System.out.println("today temperature =" + temperature);
        System.out.println("today pressure =" + pressure);
        System.out.println("today humidity=" + humidity);
    }

}

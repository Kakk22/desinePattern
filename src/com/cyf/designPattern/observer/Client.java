package com.cyf.designPattern.observer;

public class Client {
    public static void main(String[] args) {
        //创建 Subject WeatherData 数据源
        WeatherData weatherData = new WeatherData();
        //创建观察者 observer
        Observer currentConditions = new CurrentConditions();
        Observer otherCurrentConditions = new OtherCurrentConditions();

        //把观察者注册进 Subject
        weatherData.registerObserver(currentConditions);
        weatherData.registerObserver(otherCurrentConditions);

        System.out.println("========更新数据，并通知观察者========");
        weatherData.seData(20f,20f,133f);


        weatherData.removeObserver(currentConditions);
        System.out.println("=======Remove CurrentConditions=======");
        weatherData.notifyObserver();
    }
}

package com.behavioraltype.observer.improve;

import java.util.Observable;

public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer observer = new CurrentCondition();
        weatherData.addObserver(observer);
        weatherData.setData(10f, 100f, 30.3f);
    }
}

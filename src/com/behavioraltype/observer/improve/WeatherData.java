package com.behavioraltype.observer.improve;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private float temperature;
    private float pressure;
    private float humidity;
    List<Observer> observers;

    public void dataChange(){
        notifyObservers();
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity =humidity;
        dataChange();
    }

    public WeatherData(){
        observers  = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature,pressure,humidity);
        }
    }
}

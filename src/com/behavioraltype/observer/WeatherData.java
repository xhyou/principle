package com.behavioraltype.observer;

/**
 * 显示气象站的天气信息
 */
public class WeatherData {
    //温度
    private float temperature;
    private float pressure;
    private float humidity;
    private CurrentConditions currentConditions;

    public WeatherData(CurrentConditions currentConditions) {
        this.currentConditions = currentConditions;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }

    public void dataChange(){
        currentConditions.update(getTemperature(),getPressure(),getHumidity());
    }

    public void setData(float temperature, float pressure, float humidity){
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;

        dataChange();
    }
}

package com.structural.adapter.objectceadapter;

public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        IVoltage5V iVoltage5V = new VoltageAdapter(new Voltage220V());
        phone.charging(iVoltage5V);
    }
}

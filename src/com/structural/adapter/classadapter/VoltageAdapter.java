package com.structural.adapter.classadapter;

public class VoltageAdapter extends Voltage220V implements IVoltage5V {

    @Override
    public int output5V() {
        int electric = output220V();
        int targetElectric = electric / 44;
        return targetElectric;
    }
}

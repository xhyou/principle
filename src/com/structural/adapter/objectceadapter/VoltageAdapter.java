package com.structural.adapter.objectceadapter;

public class VoltageAdapter implements IVoltage5V {

    private Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V){
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        //违反了迪米特法则 44
        int electric = voltage220V.output220V();
        int targetElectric = electric / 44;
        return targetElectric;
    }
}

package com.maksimik.weather.model;

import java.io.Serializable;

//TODO check for proper operation
public class Snow implements Serializable {
    private boolean mHas;
    private double mValue;

    /*public Snow(double value) {
        this.mValue = value;
    }*/

    public double getValue() {
        return mValue;
    }

    public void setValue(double value) {
        this.mValue = value;
    }

    public boolean isHas() {
        return mHas;
    }

    public void setHas(boolean has) {
        this.mHas = has;
    }
}
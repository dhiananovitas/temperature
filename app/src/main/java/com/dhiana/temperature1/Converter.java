package com.dhiana.temperature1;

/**
 * Created by LENOVO on 06/11/2018.
 */

public class Converter {
    private double temp = 0;

    public Converter() {
    }

    public Converter(double temp) {
        this.temp = temp;
    }

    public void setTemperature(double temp) {
        this.temp = temp;
    }

    public double getCelcius() {
        return temp;
    }

    public double getFarenheit() {
        temp = (getCelcius() * 1.8) +32.0;
        return temp;
    }

    public double getKelvin() {
        temp = (getCelcius() + 273.15);
        return temp;
    }
}


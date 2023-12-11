package org.example.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {

    private double temp;
    @JsonProperty("feels_like")
    private double feelsLike;

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                ", feelsLike=" + feelsLike +
                '}';
    }
}

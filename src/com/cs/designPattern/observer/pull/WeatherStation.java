package com.cs.designPattern.observer.pull;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay conditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80,65,30.4f);
    }
}

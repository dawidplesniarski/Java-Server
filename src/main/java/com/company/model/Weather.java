package com.company.model;

public class Weather{
private String weatherData;

    public Weather(String weatherData){
        this.weatherData = weatherData;
    }

    public Weather() {

    }

    public String getWeatherData(){
        return weatherData;
    }

    public void setWeatherData(String weatherData){
        this.weatherData = weatherData;
    }

}

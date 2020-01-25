package com.company.model;

public class Weather{

private String weatherData;
private String name;
private String cod;

    public Weather(String weatherData){
        this.weatherData = weatherData;
    }

    public Weather(String name, String cod){
        this.name = name;
        this.cod = cod;
    }

    public Weather() {
    }

    @Override
    public String toString() {
        return name + " " + cod;
    }

    public String getWeatherData(){
        return weatherData;
    }

    public void setWeatherData(String weatherData){
        this.weatherData = weatherData;
    }

}

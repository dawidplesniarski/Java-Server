package com.company.model;

public class WeatherJDBC {
    private String cityName;
    private String averageTemp;
    private String dbFeelsLike;
    private String dbPressure;
    private String dbHumidity;

    public WeatherJDBC(String name, String temp, String feelsLike, String pressure, String humidity){
        cityName = name;
        averageTemp = temp;
        dbFeelsLike = feelsLike;
        dbPressure = pressure;
        dbHumidity = humidity;
    }

    public String toString() {
        return "Miasto: " + cityName + ", Temperatura: " + averageTemp + ", Temperatura odczuwalna: " + dbFeelsLike + ", Cisnienie: " + dbPressure + ", Wilgotnosc: " + dbHumidity;
    }
}

package com.company.model;

import com.google.gson.annotations.SerializedName;

public class Weather{

private String weatherData;
private String name;
private String cod;
private MainInformations main;


    public Weather(String name, String cod, MainInformations main){
        this.name = name;
        this.cod = cod;
        this.main = main;
    }

    public String getName() {
        return name;
    }

    public String getTemp(){
        return main.getTemp().toString();
    }

    public String getPressure(){
        return main.getPressure().toString();
    }

    public String getCod() {
        return cod;
    }

    public String getTempMin() { return main.getTempMin().toString(); }

    public String getTempMax() { return main.getTempMax().toString(); }

    public String getFeelsLike() { return main.getFeelsLike().toString(); }

    public String getHumidity() { return main.getHumidity().toString(); }


    public void setName(String name) {
        this.name = name;
    }


    public void setCod(String cod) {
        this.cod = cod;
    }

    public Weather(String string1, String s, String setString, String string, String resultSetString) {
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

class MainInformations{
    private Double temp;
    @SerializedName("temp_min")
    private Double tempMin;
    @SerializedName("temp_max")
    private Double tempMax;
    @SerializedName("feels_like")
    private Double feelsLike;
    private Integer pressure;
    private Integer humidity;

    public MainInformations(Double temp, Double tempMin, Double tempMax, Double feelsLike, Integer pressure, Integer humidity){
        this.temp = temp;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.feelsLike = feelsLike;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public Double getTemp() {
        return temp;
    }

    public Integer getPressure() {
        return pressure;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public Double getFeelsLike() {
        return feelsLike;
    }

    public Integer getHumidity() {
        return humidity;
    }
}

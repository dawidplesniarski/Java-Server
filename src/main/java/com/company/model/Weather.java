package com.company.model;

public class Weather{

private String weatherData;
private String name;
private String cod;
private MainInformations main;

    public Weather(String weatherData){
        this.weatherData = weatherData;
    }

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

    public void setName(String name) {
        this.name = name;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public Weather(String string, String resultSetString) {
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
    private Integer pressure;

    public MainInformations(Double temp, Integer pressure){
        this.temp = temp;
        this.pressure = pressure;
    }

    public Double getTemp() {
        return temp;
    }

    public Integer getPressure() {
        return pressure;
    }
}

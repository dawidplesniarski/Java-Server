package com.company.web;

import com.company.api.WeatherDao;
import com.company.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("")
@Controller
public class WeatherController {

    //private String weatherData;

    @Autowired
    private WeatherDao weatherDao;

    public void setWeatherDao(WeatherDao weatherDao){
        this.weatherDao = weatherDao;
    }

        @RequestMapping(method = RequestMethod.GET)
        public String printHello(ModelMap model) throws Exception {

        //weatherData = (String) weatherDao.getData();
        Weather weather = new Weather((String) weatherDao.getData());
        model.addAttribute("weatherInformation", weather.getWeatherData());
        return "weather/weather";
    }

    /*
    @RequestMapping(method = RequestMethod.GET)
    public Weather form() {
        return new Weather();
    }



    @RequestMapping(method = RequestMethod.POST)
    public String getWeatherInformation(Weather weather){
        return weatherInformation;
    } */
}

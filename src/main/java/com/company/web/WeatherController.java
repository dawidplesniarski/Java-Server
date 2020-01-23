package com.company.web;

import com.company.api.WeatherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("")
@Controller
public class WeatherController {
    private String weatherInformation;

    @Autowired
    private WeatherDao weatherDao;

    public void setWeatherDao(WeatherDao weatherDao){
        this.weatherDao = weatherDao;
    }

        @RequestMapping(method = RequestMethod.GET)
        public String printHello(ModelMap model) throws Exception {

        weatherInformation = (String) weatherDao.getData();
        model.addAttribute("weatherInformation", weatherInformation);
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

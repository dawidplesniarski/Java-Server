package com.company.web;

import com.company.api.WeatherDao;
import com.company.jdbc.InsertDao;
import com.company.model.Weather;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;


@RequestMapping("")
@Controller
public class WeatherController {


    private WeatherDao weatherDao;
    private InsertDao insertDao;
    @Autowired
    public void setWeatherDao(@Autowired WeatherDao weatherDao){
        this.weatherDao = weatherDao;
    }
    @Autowired
    public void setInsertDao(@Autowired InsertDao insertDao) { this.insertDao = insertDao; }


    @RequestMapping(method = RequestMethod.GET)
        public String printHello(@RequestParam("cityName") String cityName, ModelMap model) throws Exception {

        System.out.println(cityName);
        Weather weather;
        Gson gson = new Gson();
        try {
            weather = gson.fromJson((String) weatherDao.getData(cityName), Weather.class);

            model.addAttribute("weatherName", weather.getName());
            model.addAttribute("weatherTemp", weather.getTemp());
            model.addAttribute("weatherTempMin", weather.getTempMin());
            model.addAttribute("weatherTempMax", weather.getTempMax());
            model.addAttribute("weatherFeelsLike", weather.getFeelsLike());
            model.addAttribute("weatherPressure", weather.getPressure());
            model.addAttribute("weatherHumidity", weather.getHumidity());

            insertDao.insertData(weather);


            return "weather/weather";
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "redirect:../";
        }


    }

}

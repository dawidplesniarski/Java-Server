package com.company.web;

import com.company.api.WeatherDao;
import com.company.jdbc.InsertDao;
import com.company.model.Weather;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


@RequestMapping("")
@Controller
public class WeatherController {


    @Autowired
    private WeatherDao weatherDao;
    @Autowired
    private InsertDao insertDao;

    public void setWeatherDao(WeatherDao weatherDao){
        this.weatherDao = weatherDao;
    }
    public void setInsertDao(InsertDao insertDao) { this.insertDao = insertDao; }


    @RequestMapping(method = RequestMethod.GET)
        public String printHello(ModelMap model) throws Exception {

        Weather weather;
        Gson gson = new Gson();
        weather = gson.fromJson((String) weatherDao.getData(), Weather.class);

        model.addAttribute("weatherName", weather.getName());
        model.addAttribute("weatherTemp", weather.getTemp());
        model.addAttribute("weatherTempMin", weather.getTempMin());
        model.addAttribute("weatherTempMax", weather.getTempMax());
        model.addAttribute("weatherFeelsLike", weather.getFeelsLike());
        model.addAttribute("weatherPressure", weather.getPressure());
        model.addAttribute("weatherHumidity", weather.getHumidity());

        insertDao.insertData(weather);


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

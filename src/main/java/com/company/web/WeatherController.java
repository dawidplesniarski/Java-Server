package com.company.web;

import com.company.api.WeatherDao;
import com.company.model.Weather;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("")
@Controller
public class WeatherController {


    @Autowired
    private WeatherDao weatherDao;

    public void setWeatherDao(WeatherDao weatherDao){
        this.weatherDao = weatherDao;
    }

        @RequestMapping(method = RequestMethod.GET)
        public String printHello(ModelMap model) throws Exception {

        Weather weather;// = new Weather((String) weatherDao.getData());

            Gson gson = new Gson();
            weather = gson.fromJson((String) weatherDao.getData(), Weather.class);
            //System.out.println("Controller" + weather.getTemp() + weather.getPressure());
        model.addAttribute("weatherName", weather.getName());
        model.addAttribute("weatherCod", weather.getCod());
        model.addAttribute("weatherTemp", weather.getTemp());
        model.addAttribute("weatherPressure", weather.getPressure());
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

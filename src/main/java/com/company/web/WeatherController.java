package com.company.web;

import com.company.api.WeatherDao;
import com.company.jdbc.InsertDao;
import com.company.jdbc.WeatherInsert;
import com.company.model.Weather;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


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

        WeatherInsert weatherInsert = new WeatherInsert();
        insertDao.insertData();


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

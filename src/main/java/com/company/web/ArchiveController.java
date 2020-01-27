package com.company.web;

import com.company.api.WeatherDao;
import com.company.jdbc.SelectDao;
import com.company.model.Weather;
import com.company.model.WeatherJDBC;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ArchiveController {

        private List<WeatherJDBC> weatherList;

        @Autowired
        private SelectDao selectDao;

        public void setWeatherDao(WeatherDao weatherDao){
            this.selectDao = selectDao;
        }

        public ArchiveController(){}



        @RequestMapping(method = RequestMethod.GET)
        public void printArchive(ModelMap model) throws Exception {

            weatherList = selectDao.selectAll();

            model.addAttribute("weatherList",weatherList);

            for(int i = 0; i<weatherList.size();i++){
                System.out.println(weatherList.get(i).toString());
            }

            //Weather weather;

            //Gson gson = new Gson();
            //weather = gson.fromJson((String) weatherDao.getData(), Weather.class);


//            model.addAttribute("weatherName", weather.getName());
//            model.addAttribute("weatherTemp", weather.getTemp());
//            model.addAttribute("weatherTempMin", weather.getTempMin());
//            model.addAttribute("weatherTempMax", weather.getTempMax());
//            model.addAttribute("weatherFeelsLike", weather.getFeelsLike());
//            model.addAttribute("weatherPressure", weather.getPressure());
//            model.addAttribute("weatherHumidity", weather.getHumidity());

            //return "archive/weather_archive";
        }

    @RequestMapping
    public void weather(@RequestParam("id") Integer id, Model model) {
        model.addAttribute(weatherList.get(id));
    }

}

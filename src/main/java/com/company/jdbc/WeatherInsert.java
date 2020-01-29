package com.company.jdbc;

import com.company.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;


@Service("insertDao")
public class WeatherInsert implements InsertDao {

    private static final String INSERT_DATA = "INSERT INTO tok.weather_archive (cityName, averageTemp, feels_like, pressure, humidity) VALUES (?, ?, ?, ?, ?)";

    @Autowired
    @Qualifier("jdbcTemplateInsert")
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void insertData() throws Exception {
        //jdbcTemplate.update(INSERT_DATA,name,temp,feels_like,pressure,humidity);
//        jdbcTemplate.update(INSERT_DATA,
//                weather.getName(),
//                weather.getTemp(),
//                weather.getFeelsLike(),
//                weather.getPressure(),
//                weather.getHumidity()
//                );
        jdbcTemplate.update(INSERT_DATA,
                "Brzesko",
                2.33,
                1.33,
                1001,
                87
        );
    }
}

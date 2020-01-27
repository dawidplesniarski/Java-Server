package com.company.jdbc;

import com.company.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service("insertDao")
public class WeatherInsert implements InsertDao {

    private static final String INSERT_DATA = "INSERT INTO tok.weather (name, temp, feels_like, pressure, humidity) VALUES (?,?,?,?,?)";

//    @Autowired
//    @Qualifier("jdbcTemplate")
//    private NamedParameterJdbcOperations jdbcTemplate;


    @Override
    public void insertData(String name, Double temp, Double feels_like, Integer pressure, Integer humidity) throws Exception {
        //jdbcTemplate.update(INSERT_DATA,name,temp,feels_like,pressure,humidity);
    }
}

package com.company.jdbc;

import com.company.model.WeatherJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service("selectDao")
public class WeatherSelect implements SelectDao {

    private static final String GET_ALL_SQL = "SELECT cityName, averageTemp, feels_like, pressure, humidity FROM tok.weather_archive";
    //private static final String GET_ALL_SQL = "SELECT cityName, averageTemp FROM tok.weather";

    @Autowired
    @Qualifier("jdbcTemplate")
    private NamedParameterJdbcOperations jdbcTemplate;

    @Autowired
    @Qualifier("weatherRowMapper")
    private WeatherRowMapper weatherRowMapper;

    @Override
    public List<WeatherJDBC> selectAll() throws Exception {
        return jdbcTemplate.query(GET_ALL_SQL, new HashMap<String, Object>(),weatherRowMapper);
    }
}

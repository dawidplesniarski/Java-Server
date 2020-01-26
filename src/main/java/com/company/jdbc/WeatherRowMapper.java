package com.company.jdbc;

import com.company.model.Weather;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class WeatherRowMapper implements RowMapper<Weather> {

    @Override
    public Weather mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        Weather weather = new Weather(resultSet.getString(1),resultSet.getString(2));
        return weather;
    }
}

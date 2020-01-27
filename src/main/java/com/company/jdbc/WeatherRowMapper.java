package com.company.jdbc;

import com.company.model.WeatherJDBC;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class WeatherRowMapper implements RowMapper<WeatherJDBC> {

    @Override
    public WeatherJDBC mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        WeatherJDBC weather = new WeatherJDBC(resultSet.getString(1),resultSet.getString(2),resultSet.getString(3),
                resultSet.getString(4),resultSet.getString(5));
        return weather;
//        WeatherJDBC weather = new WeatherJDBC(resultSet.getString(1),resultSet.getString(2));
//        return weather;
    }
}

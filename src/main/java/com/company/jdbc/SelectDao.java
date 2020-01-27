package com.company.jdbc;

import com.company.model.WeatherJDBC;

import java.util.List;

public interface SelectDao {
    List<WeatherJDBC> selectAll() throws Exception;
}

package com.company.jdbc;

import com.company.model.Weather;

import java.util.List;

public interface SelectDao {
    List<Weather> selectAll() throws Exception;
}

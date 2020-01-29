package com.company.jdbc;

import com.company.model.Weather;

public interface InsertDao {
    void insertData(Weather weather) throws Exception;
}

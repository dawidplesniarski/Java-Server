package com.company.jdbc;

public interface InsertDao {
    void insertData(String name, Double temp, Double feels_like, Integer pressure, Integer humidity) throws Exception;
}

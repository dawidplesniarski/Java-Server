package com.company.api;


import org.springframework.stereotype.Service;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


@Service("weatherDao")
public class WeatherJsonParser implements WeatherDao {


    @Override
    public Object getData(String cityName) throws Exception {
        String sURL = "https://api.openweathermap.org/data/2.5/weather?q="+cityName+",PL&APPID=749561a315b14523a8f5f1ef95e45864&units=metric";

        HttpURLConnection connection = null;
        BufferedReader reader = null;

            URL url = new URL(sURL);
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();


            InputStream stream = connection.getInputStream();

            reader = new BufferedReader(new InputStreamReader(stream));

            StringBuilder buffer = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                buffer.append(line).append("\n");
            }

        return buffer.toString();

    }
}

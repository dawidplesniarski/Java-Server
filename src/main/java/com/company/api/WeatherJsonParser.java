package com.company.api;

import org.springframework.stereotype.Service;

import java.net.URL;
import java.net.URLConnection;

@Service("weatherDao")
public class WeatherJsonParser implements WeatherDao {
    @Override
    public Object getData() throws Exception {
//        String sURL = "https://api.openweathermap.org/data/2.5/weather?q=Brzesko,PL&APPID=749561a315b14523a8f5f1ef95e45864&units=metric"; //just a string
//
//        // Connect to the URL using java's native library
//        URL url = new URL(sURL);
//        URLConnection request = url.openConnection();
//        request.connect();
//
//        return request.getContent();

        return "test";
        // Convert to a JSON object to print data
        //Gson gson = new Gson(); //from gson
        //JsonElement root = gson.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
        //JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object.
        //String zipcode = rootobj.get("zip_code").getAsString(); //just grab the zipcode
    }
}

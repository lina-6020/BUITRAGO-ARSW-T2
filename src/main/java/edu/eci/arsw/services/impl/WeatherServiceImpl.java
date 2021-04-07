package edu.eci.arsw.services.impl;

import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.client.HttpConnectionService;
import edu.eci.arsw.services.WeatherException;
import edu.eci.arsw.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import edu.eci.arsw.model.City;
@Service
class WeatherServiceImpl implements WeatherService{

    @Autowired
    @Qualifier("httpConnectionService")
    HttpConnectionService request;

    @Override
    public City getInfo(String ciudad) throws WeatherException{
        try {
            Gson gson = new Gson();
            City city= gson.fromJson(request.getInfo(ciudad),City.class);
            return city;
        } catch (UnirestException e) {
            throw new WeatherException(e.toString());
        }
    }
}

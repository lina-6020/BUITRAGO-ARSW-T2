package edu.eci.arsw.services;
import edu.eci.arsw.model.City;

import edu.eci.arsw.services.WeatherException;
import org.springframework.stereotype.Service;

import java.io.IOException;


@Service("weatherService")
public interface WeatherService {

    City getInfo(String ciudad) throws WeatherException;
}

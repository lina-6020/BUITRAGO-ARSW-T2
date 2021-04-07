package edu.eci.arsw.client;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.services.WeatherException;
/**Esta clase es la interface de la conexión al api**/

public interface IHttpConnectionService {

    String getInfo(String nameCity) throws WeatherException, UnirestException;
    }


package edu.eci.arsw.client;

import edu.eci.arsw.services.WeatherException;
import org.springframework.stereotype.Component;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

@Component("httpConnectionService")
public class HttpConnectionService implements IHttpConnectionService{
	@Override
	public String getInfo(String nameCity) throws WeatherException, UnirestException {
		HttpResponse<String> response = Unirest.get("https://api.openweathermap.org/data/2.5/weather?q="+nameCity+"&appid=34471f529b75e07d7310ceaf920b8014")
				.asString();
		if (response.getStatus()!=200){
			throw new WeatherException("Error al conectar");
		}
		return response.getBody();
		
	}

}

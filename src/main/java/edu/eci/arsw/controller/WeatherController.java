package edu.eci.arsw.controller;

import edu.eci.arsw.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**Esta clase es la encargada de retornar los datos por ciudad**/
@RestController
@RequestMapping(value = "/Ciudades")
public class WeatherController {

    @Autowired
    @Qualifier("weatherServiceImpl")
    WeatherService cs;

    @RequestMapping(method = RequestMethod.GET, value = "/{ciudad}")
    public ResponseEntity<?> getDataByName(@PathVariable String ciudad){
        try{
            return new ResponseEntity<>(cs.getInfo(ciudad), HttpStatus.ACCEPTED);
        }catch (Exception e){
            return new ResponseEntity<>("400 Bad Request", HttpStatus.NOT_FOUND);
        }
    }
}

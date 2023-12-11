package org.example.services;

import org.example.models.LatLong;
import org.example.models.Weather;
import org.example.models.WeatherObject;
import org.springframework.web.client.RestTemplate;

public class WeatherService {
    private RestTemplate template = new RestTemplate();
    private final String API_URL = "http://api.openweathermap.org/geo/1.0/zip";
    private final String API_KEY = "97adfd33cf5d899963b6dcda92cd7a86";

    public LatLong getLatLong(String zipcode){
        String url = API_URL + "?zip=" + zipcode + "&appid=" + API_KEY;
        return template.getForObject(url, LatLong.class);
    }

    public WeatherObject getWeather(LatLong latLong){
        String url = "https://api.openweathermap.org/data/2.5/weather?lat=" +
                latLong.getLat() + "&lon=" +
                latLong.getLon() + "&units=imperial&appid=" + API_KEY;
        return template.getForObject(url, WeatherObject.class);
    }
}

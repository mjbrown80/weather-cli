package org.example;

import org.example.models.LatLong;
import org.example.models.WeatherObject;
import org.example.services.WeatherService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter zipcode: ");
        String zipcode = input.nextLine();

        WeatherService service = new WeatherService();
        LatLong latLong = service.getLatLong(zipcode);
        System.out.println("You are in " + latLong.getName());
        System.out.println("Your latitude is " + latLong.getLat() + " and longitude is " + latLong.getLon());

        WeatherObject weather = service.getWeather(latLong);
        System.out.println("Current temperature is " + weather.getMain().getTemp());
        System.out.println("Current temperature feels like: " + weather.getMain().getFeelsLike());
        System.out.println("Today's weather: " + weather.getWeather()[0].getDescription());

        if (weather.getMain().getFeelsLike() < 50){
            System.out.println("Be sure to bring a coat!");
        }
    }

}
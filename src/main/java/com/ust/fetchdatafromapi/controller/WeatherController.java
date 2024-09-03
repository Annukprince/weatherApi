
package com.ust.fetchdatafromapi.controller;

import com.ust.fetchdatafromapi.response.SearchByCity;
import com.ust.fetchdatafromapi.service.ApiCallerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@RequiredArgsConstructor
public class WeatherController {

    private final ApiCallerService apiCallerService;

    @GetMapping("/search")
    public ResponseEntity<SearchByCity> searchWeatherByCity(@RequestParam String stationName , @RequestParam String period) {
        System.out.println(stationName);
        SearchByCity weatherData = apiCallerService.searchWeatherByCity(stationName , period);
        return ResponseEntity.ok(weatherData);
    }

//    @GetMapping
//    public ResponseEntity<SearchByCity> getWeatherByCity(@RequestParam String city) {
//        SearchByCity weatherData = apiCallerService.searchWeatherByCity(city);
//        return ResponseEntity.ok(weatherData);
//    }



@ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}

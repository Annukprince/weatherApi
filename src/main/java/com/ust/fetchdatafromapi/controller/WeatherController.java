
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

    @GetMapping("/{city}")
    public ResponseEntity<SearchByCity> getWeatherByCity(@PathVariable String city) {
        SearchByCity weatherData = apiCallerService.searchWeatherByCity(city);
        return ResponseEntity.ok(weatherData);
    }



@ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleException(Exception e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}

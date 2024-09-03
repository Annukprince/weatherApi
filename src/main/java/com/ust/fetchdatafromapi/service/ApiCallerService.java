package com.ust.fetchdatafromapi.service;


import com.ust.fetchdatafromapi.response.SearchByCity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import static org.springframework.http.MediaType.APPLICATION_JSON;

@Service
@RequiredArgsConstructor
public class ApiCallerService {

    @Autowired
    private final RestClient restClient;

    // https://api.oceandrivers.com:443/v1.0/getAemetStation/aeropuertopalma/lastdata/
    public SearchByCity searchWeatherByCity(String stationName , String period) {
        //System.out.println("service"+city);
        return restClient.get()
                .uri("/getAemetStation/{stationName}/{period}/", stationName, period)
                .retrieve()
                .body(SearchByCity.class);
    }

}

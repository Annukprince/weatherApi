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
    RestClient restClient;

    // https://api.oceandrivers.com:443/v1.0/getAemetStation/aeropuertopalma/lastdata/
    public SearchByCity searchWeatherByCity(String city) {
        System.out.println(city);
        return restClient.get()
                .uri("/{city}/lastdata", city)
                .retrieve()
                .body(SearchByCity.class);
    }

}

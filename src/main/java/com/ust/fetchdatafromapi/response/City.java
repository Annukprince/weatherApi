package com.ust.fetchdatafromapi.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record City(
        double temperature,
        int windDirection,
        int pressure,
        double windSpeedGust,
        double windSpeed,
        int humidity,
        double rainfall,
        double rainfallDay,
        double rainfallMonth,
        String timestamp,
        int windDirectionGust,
        double latitude,
        double longitude,
        int localTimeOffset
) {}
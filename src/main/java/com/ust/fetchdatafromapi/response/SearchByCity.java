package com.ust.fetchdatafromapi.response;

import java.util.List;

public record SearchByCity(
        double TEMPERATURE,
        int TWD,
        int PRESSURE,
        double RAIN_MONTH,
        double TWS_GUST,
        double RAIN_DAY,
        double RAIN,
        int HUMIDITY,
        double TWS,
        String TIME_STRING,
        int TWD_GUST,
        long TIME,
        double LATITUDE,
        double LONGITUDE,
        int LOCALTIME
)  {
}

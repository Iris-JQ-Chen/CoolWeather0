package com.example.coolweather0.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 蒲公英之流 on 2019-02-10.
 */

public class Weather {

    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}

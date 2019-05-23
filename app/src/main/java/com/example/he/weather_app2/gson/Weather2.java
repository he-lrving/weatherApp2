package com.example.he.weather_app2.gson;

import com.example.he.weather_app2.gson.Basic;
import com.example.he.weather_app2.gson.Forecast;
import com.example.he.weather_app2.gson.Update;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather2 {
    public Basic basic;
    public Update update;
    public String status;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;

}

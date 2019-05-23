package com.example.he.weather_app2.gson;

import com.example.he.weather_app2.gson.Basic;
import com.example.he.weather_app2.gson.Suggestion;
import com.example.he.weather_app2.gson.Update;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather3 {
    public Basic basic;
    public Update update;
    public String status;
    @SerializedName("lifestyle")
    public List<Suggestion>suggestionList;
}

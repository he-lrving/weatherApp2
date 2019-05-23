package com.example.he.weather_app2.gson;

import com.google.gson.annotations.SerializedName;

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond_txt")
    public String txt;
    @SerializedName("fl")
    public String feel_tmp;
    @SerializedName("hum")
    public String re_hum;
    @SerializedName("wind_dir")
    public String wind_dir;
    @SerializedName("wind_sc")
    public String wind_sc;
    @SerializedName("pres")
    public String pres;
}

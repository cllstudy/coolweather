package com.cllstudy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ChenLianglei on 2017/9/8 21:35.
 */

public class Weather {
    public String status;
    public Basic mBasic;
    public AQI mAQI;
    public Now mNow;
    public Suggestion mSuggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> mForecasts;
}

package com.cllstudy.coolweather.gson;

/**
 * Created by ChenLianglei on 2017/9/8 21:17.
 */

public class AQI {
    public AQICity city;

    public class AQICity {
        public String api;
        public String pm25;
    }
}

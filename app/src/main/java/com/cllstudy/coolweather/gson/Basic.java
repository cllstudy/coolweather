package com.cllstudy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ChenLianglei on 2017/9/8 21:13.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update mUpdate;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

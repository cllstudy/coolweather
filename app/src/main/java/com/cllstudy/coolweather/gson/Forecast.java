package com.cllstudy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ChenLianglei on 2017/9/8 21:31.
 */

public class Forecast {
    public String date;
    @SerializedName("tmp")
   public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature {
        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt")
        public String info;
    }
}

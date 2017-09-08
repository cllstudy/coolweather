package com.cllstudy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ChenLianglei on 2017/9/8 21:19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }
}

package com.cllstudy.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ChenLianglei on 2017/9/8 21:21.
 */

public class Suggestion {
    @SerializedName("comf")
    public  Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport mSport;

    public class Comfort {
        @SerializedName("txt")
        public String info;
    }

    public class CarWash {
        @SerializedName("txt")
        public String info;
    }
    public class Sport {
        @SerializedName("txt")
        public String info;
    }
}

package com.twoexample.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 27837 on 2017/8/17.
 */

public class AQI {
    public AQICity city;

    public class AQICity {

        public String aqi;
        public String pm25;
    }
}

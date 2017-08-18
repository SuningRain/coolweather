package com.twoexample.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 27837 on 2017/8/17.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {
        @SerializedName("loc")
        public String updateTime;
    }
}

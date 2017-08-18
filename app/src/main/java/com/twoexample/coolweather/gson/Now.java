package com.twoexample.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 27837 on 2017/8/17.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}

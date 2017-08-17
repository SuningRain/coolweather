package com.twoexample.coolweather.util;

import android.util.Log;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 27837 on 2017/8/17.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback ) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(address)
                .build();
        client.newCall(request).enqueue(callback);
    }
}

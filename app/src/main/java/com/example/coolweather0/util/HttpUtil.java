package com.example.coolweather0.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 蒲公英之流 on 2019-02-08.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}

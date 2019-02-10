package com.example.coolweather0.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 蒲公英之流 on 2019-02-10.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}

package com.example.coolweather0.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 蒲公英之流 on 2019-02-10.
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

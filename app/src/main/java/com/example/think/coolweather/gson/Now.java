package com.example.think.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Think on 2018/1/8.
 */
public class Now {

    @SerializedName("tmp")
    public String tmperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("txt")
        public String info;
    }

}

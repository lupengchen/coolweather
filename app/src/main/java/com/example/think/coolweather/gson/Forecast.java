package com.example.think.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Think on 2018/1/8.
 */
public class Forecast {

    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More{
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature{
        public String max;

        public String min;
    }

}

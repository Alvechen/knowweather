package com.alvechen.knowweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Alvechen on 2017/8/22.
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

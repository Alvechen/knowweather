package com.alvechen.knowweather.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Alvechen on 2017/8/22.
 */

public class HttpUtil {


    /**
     * 发送请求
     * @param url 请求地址
     * @param callback 回调
     */
    public static void sendOkHttpRequest(String url, okhttp3.Callback callback){

        //新建客户端
        OkHttpClient client = new OkHttpClient();
        //构建请求
        Request request = new Request.Builder().url(url).build();
        //发送请求
        client.newCall(request).enqueue(callback);

    }
}

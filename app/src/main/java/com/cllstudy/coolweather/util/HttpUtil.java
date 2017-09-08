package com.cllstudy.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by ChenLianglei on 2017/9/8 10:49.
 * 发起一个HTTP请求只需调用sendOkHttpRequest()方法,传入请求地址,并注册一个回调来处理服务器响应就可以了.
 */

public class HttpUtil {
    public  static void sendOkHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}

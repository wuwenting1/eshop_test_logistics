package com.eshop.util.service;

import com.eshop.util.HttpUtils;
import com.eshop.util.JsonMapper;
import com.eshop.util.pojo.LogisticModel;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;

import java.util.HashMap;
import java.util.Map;

public class LogisticsImpl {
    public static void main(String[] args) {
        String host = "https://goexpress.market.alicloudapi.com";
        String path = "/goexpress";
        String method = "GET";
        String appcode = "f822feef91dc4b45ad7dd5d5157c2f1b";
        Map<String, String> headers = new HashMap<String, String>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<String, String>();
        querys.put("no", "780098068058");
        //querys.put("type", "zto");
        try {
            HttpResponse response = HttpUtils.doGet(host, path, method, headers, querys);
            //System.out.println(response.toString());如不输出json, 请打开这行代码，打印调试头部状态码。
            //状态码: 200 正常；400 URL无效；401 appCode错误； 403 次数用完； 500 API网管错误
            //获取response的body
            String content = EntityUtils.toString(response.getEntity());
            LogisticModel logisticModel = JsonMapper.fromJsonString(content, LogisticModel.class);
            System.out.println(logisticModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package com.zhongger.zmail.thirdparty.component;

import com.zhongger.zmail.thirdparty.utils.HttpUtil;
import lombok.Data;
import org.apache.http.HttpResponse;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;

import java.util.HashMap;
import java.util.Map;

@Data
@Controller
public class SmsComponent {
    private String method = "POST";
    private String host = "https://gyytz.market.alicloudapi.com";
    private String path = "/sms/smsSend";
    private String appcode = "242717bdae8343b78fe2eede392a7339";
    private String smsSignId = "2e65b1bb3d054466b82f0c9d125465e2";
    private String templateId = "a09602b817fd47e59e7c6e603d3f088d";

    public void sendCode(String mobile, String code) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<>();
        querys.put("mobile", mobile);
        querys.put("param", code);
        querys.put("smsSignId", smsSignId);
        querys.put("templateId", templateId);
        Map<String, String> bodys = new HashMap<>();

        try {

            HttpResponse response = HttpUtil.doPost(host, path, method, headers, querys, bodys);
            System.out.println(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


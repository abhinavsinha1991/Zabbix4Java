package com.zabbix4j.templatescreenitem;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiMethod;

/**
 * @author Suguru Yajima
 */
public class TemplateScreenItem extends ZabbixApiMethod {
    public TemplateScreenItem(String apiUrl, String auth) {
        super(apiUrl, auth);
    }

    public TemplateScreenItemGetResponse get(TemplateScreenItemGetRequest request) throws ZabbixApiException {
        TemplateScreenItemGetResponse response = null;
        request.setAuth(auth);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String requestJson = gson.toJson(request);

        try {
            String responseJson = sendRequest(requestJson);

            response = gson.fromJson(responseJson, TemplateScreenItemGetResponse.class);
        } catch (ZabbixApiException e) {
            throw new ZabbixApiException(e);
        }

        return response;
    }
}

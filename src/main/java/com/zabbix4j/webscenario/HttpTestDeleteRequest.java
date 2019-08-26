package com.zabbix4j.webscenario;

import java.util.ArrayList;
import java.util.List;
import com.zabbix4j.ZabbixApiRequest;

/**
 * @author Suguru Yajima
 */
public class HttpTestDeleteRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();

    public HttpTestDeleteRequest() {
        setMethod("httptest.delete");
    }

    public void addHttpTestId(Integer id) {
        params.add(id);
    }
}

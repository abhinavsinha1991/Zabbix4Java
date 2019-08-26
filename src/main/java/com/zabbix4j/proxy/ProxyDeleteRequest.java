package com.zabbix4j.proxy;

import java.util.ArrayList;
import java.util.List;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

/**
 * @author Suguru Yajima
 */
public class ProxyDeleteRequest extends ZabbixApiRequest {
    private List<Integer> params = new ArrayList<Integer>();

    public ProxyDeleteRequest() {
        setMethod("proxy.delete");
    }

    public void addProxyId(Integer id) {
        params = ZbxListUtils.add(params, id);
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public List<Integer> getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(List<Integer> params) {
        this.params = params;
    }
}

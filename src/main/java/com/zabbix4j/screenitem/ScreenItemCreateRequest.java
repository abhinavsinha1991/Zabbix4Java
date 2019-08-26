package com.zabbix4j.screenitem;

import java.util.ArrayList;
import java.util.List;
import com.zabbix4j.ZabbixApiRequest;

/**
 * @author Suguru Yajima
 */
public class ScreenItemCreateRequest extends ZabbixApiRequest {
    private List<ScreenItemObject> params = new ArrayList<ScreenItemObject>();

    public ScreenItemCreateRequest() {
        setMethod("screenitem.create");
    }

    public void addScreenItem(ScreenItemObject obj) {
        params.add(obj);
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public List<ScreenItemObject> getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(List<ScreenItemObject> params) {
        this.params = params;
    }
}

package com.zabbix4j.hostprototype;

import java.util.List;
import com.zabbix4j.ZabbixApiResponse;

/**
 * @author Suguru Yajima
 */
public class HostPrototypeGetReponse extends ZabbixApiResponse {
    public HostPrototypeGetReponse() {
        super();
    }

    public List<HostPrototypeObject> result;

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public List<HostPrototypeObject> getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(List<HostPrototypeObject> result) {
        this.result = result;
    }
}

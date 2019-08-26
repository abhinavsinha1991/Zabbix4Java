package com.zabbix4j.hostprototype;

import java.util.List;
import com.zabbix4j.ZabbixApiResponse;

/**
 * @author Suguru Yajima
 */
public class HostPrototypeDeleteResponse extends ZabbixApiResponse {

    private Result result;

    public HostPrototypeDeleteResponse() {
        super();
    }

    /**
     * Gets result.
     *
     * @return Value of result.
     */
    public Result getResult() {
        return result;
    }

    /**
     * Sets new result.
     *
     * @param result New value of result.
     */
    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        private List<Integer> hostids;

        /**
         * Gets hostids.
         *
         * @return Value of hostids.
         */
        public List<Integer> getHostids() {
            return hostids;
        }

        /**
         * Sets new hostids.
         *
         * @param hostids New value of hostids.
         */
        public void setHostids(List<Integer> hostids) {
            this.hostids = hostids;
        }
    }
}

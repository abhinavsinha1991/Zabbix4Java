package com.zabbix4j.itservice;

import java.util.List;
import com.zabbix4j.ZabbixApiResponse;

/**
 * @author Suguru Yajima
 */
public class ITServiceCreateResponse extends ZabbixApiResponse {

    private Result result;

    public ITServiceCreateResponse() {
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
        private List<Integer> serviceids;

        /**
         * Gets serviceids.
         *
         * @return Value of serviceids.
         */
        public List<Integer> getServiceids() {
            return serviceids;
        }

        /**
         * Sets new serviceids.
         *
         * @param serviceids New value of serviceids.
         */
        public void setServiceids(List<Integer> serviceids) {
            this.serviceids = serviceids;
        }
    }
}

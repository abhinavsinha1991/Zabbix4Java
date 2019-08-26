package com.zabbix4j.webscenario;

import java.util.List;
import com.zabbix4j.ZabbixApiResponse;

/**
 * @author Suguru Yajima
 */
public class HttpTestCreateResponse extends ZabbixApiResponse {
    private Result result;

    public HttpTestCreateResponse() {
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
        private List<Integer> httptestids;

        /**
         * Gets httptestids.
         *
         * @return Value of httptestids.
         */
        public List<Integer> getHttptestids() {
            return httptestids;
        }

        /**
         * Sets new httptestids.
         *
         * @param httptestids New value of httptestids.
         */
        public void setHttptestids(List<Integer> httptestids) {
            this.httptestids = httptestids;
        }
    }
}

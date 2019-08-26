package com.zabbix4j.webscenario;

import java.util.List;
import com.zabbix4j.ZabbixApiRequest;

/**
 * @author Suguru Yajima
 */
public class HttpTestUpdateRequest extends ZabbixApiRequest {
    private Params params = new Params();

    public HttpTestUpdateRequest() {
        setMethod("httptest.update");
    }

    /**
     * Gets params.
     *
     * @return Value of params.
     */
    public Params getParams() {
        return params;
    }

    /**
     * Sets new params.
     *
     * @param params New value of params.
     */
    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends WebScenarioObject {
        private List<WebScenarioObject> steps;

        /**
         * Gets steps.
         *
         * @return Value of steps.
         */
        public List<WebScenarioObject> getSteps() {
            return steps;
        }

        /**
         * Sets new steps.
         *
         * @param steps New value of steps.
         */
        public void setSteps(List<WebScenarioObject> steps) {
            this.steps = steps;
        }
    }
}

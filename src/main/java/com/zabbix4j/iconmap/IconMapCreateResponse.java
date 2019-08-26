package com.zabbix4j.iconmap;

import java.util.List;
import com.zabbix4j.ZabbixApiResponse;

/**
 * @author Suguru Yajima
 */
public class IconMapCreateResponse extends ZabbixApiResponse {

    private Result result;

    public IconMapCreateResponse() {
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
        private List<Integer> iconmapids;

        /**
         * Gets iconmapids.
         *
         * @return Value of iconmapids.
         */
        public List<Integer> getIconmapids() {
            return iconmapids;
        }

        /**
         * Sets new iconmapids.
         *
         * @param iconmapids New value of iconmapids.
         */
        public void setIconmapids(List<Integer> iconmapids) {
            this.iconmapids = iconmapids;
        }
    }
}

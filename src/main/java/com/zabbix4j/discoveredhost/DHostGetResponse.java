/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.discoveredhost;

import java.util.Date;
import java.util.List;
import com.zabbix4j.ZabbixApiResponse;

/**
 * Created by Suguru Yajima on 2014/05/25.
 */
public class DHostGetResponse extends ZabbixApiResponse {

    private List<Result> result;

    public DHostGetResponse() {
        super();
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result {

        private List<Dservice> dservices;

        private Integer dhostid;
        private Integer druleid;
        private Integer status;
        private Long lastup;
        private Long lastdown;

        public Date getLastupDate() {
            if (lastup != null && lastup != 0) {
                return new Date(lastup);
            }
            return null;
        }

        public Date getLastUpDate() {
            if (lastdown != null && lastdown != 0) {
                return new Date(lastdown);
            }

            return null;
        }

        public List<Dservice> getDservices() {
            return dservices;
        }

        public void setDservices(List<Dservice> dservices) {
            this.dservices = dservices;
        }

        public Integer getDhostid() {
            return dhostid;
        }

        public void setDhostid(Integer dhostid) {
            this.dhostid = dhostid;
        }

        public Integer getDruleid() {
            return druleid;
        }

        public void setDruleid(Integer druleid) {
            this.druleid = druleid;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Long getLastup() {
            return lastup;
        }

        public void setLastup(Long lastup) {
            this.lastup = lastup;
        }

        public Long getLastdown() {
            return lastdown;
        }

        public void setLastdown(Long lastdown) {
            this.lastdown = lastdown;
        }
    }
}

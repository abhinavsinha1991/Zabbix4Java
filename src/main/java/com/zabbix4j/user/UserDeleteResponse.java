/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import java.util.List;
import com.zabbix4j.ZabbixApiResponse;

public class UserDeleteResponse extends ZabbixApiResponse {
    private Result result = new Result();

    public UserDeleteResponse() {
        super();
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        private List<Integer> usrgrpids;

        public Result() {
        }

        public List<Integer> getUsrgrpids() {
            return usrgrpids;
        }

        public void setUsrgrpids(List<Integer> usrgrpids) {
            this.usrgrpids = usrgrpids;
        }
    }
}

/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import java.util.List;
import com.zabbix4j.ZabbixApiResponse;
import com.zabbix4j.usergroup.UserGroupObject;

public class UserGetResponse extends ZabbixApiResponse {
    private List<Result> result;

    public UserGetResponse() {
        super();
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public class Result extends UserGroupObject {
        public Result() {
            super();
        }
    }
}

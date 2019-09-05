/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import java.util.List;
import com.zabbix4j.ZabbixApiResponse;

/**
 * Created by Suguru Yajima on 2014/05/14.
 */
public class UserCreateResponse extends ZabbixApiResponse {

    private Result result = new Result();

    public UserCreateResponse() {
        super();
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result {
        private List<Integer> userids;

        public Result() {
        }

        public List<Integer> getUsrIds() {
            return userids;
        }

        public void setUsrIds(List<Integer> userids) {
            this.userids = userids;
        }
    }
}

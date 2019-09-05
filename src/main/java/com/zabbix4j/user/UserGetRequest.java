/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import java.util.List;
import com.zabbix4j.GetRequestCommonParams;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

public class UserGetRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public UserGetRequest() {
        setMethod("user.get");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends GetRequestCommonParams {

        private List<Integer> userids;
        private List<Integer> usrgrpids;

        public Params() {
            super();
        }

        public void addUserId(Integer id) {
            userids = ZbxListUtils.add(userids, id);
        }

        public void addUsrgrpId(Integer id) {
            usrgrpids = ZbxListUtils.add(usrgrpids, id);
        }


    }
}

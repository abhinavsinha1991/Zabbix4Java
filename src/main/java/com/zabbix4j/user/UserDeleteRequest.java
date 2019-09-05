/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import java.util.ArrayList;
import java.util.List;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.utils.ZbxListUtils;

public class UserDeleteRequest extends ZabbixApiRequest {

    private List<Integer> params=new ArrayList<Integer>(  );

    public UserDeleteRequest() {
        setMethod("user.delete");
    }

    public List<Integer> getParams() {
        return params;
    }

    public void setParams(List<Integer> params) {
        this.params = params;
    }

    public void addParams(Integer id) {
        params = ZbxListUtils.add(params, id);
    }
}

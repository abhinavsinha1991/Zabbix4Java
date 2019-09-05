/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import java.util.List;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.usergroup.UserGroupID;
import com.zabbix4j.utils.ZbxListUtils;

/**
 * Created by Suguru Yajima on 2014/05/13.
 */
public class UserCreateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public UserCreateRequest() {
        setMethod("user.create");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends UserObject {

        private List<UserGroupID> usrgrps;
        private String passwd;

        public Params() {
            super();
        }

        public void addUserGroups(String usrgrpId) {
            usrgrps = ZbxListUtils.add(usrgrps, new UserGroupID(usrgrpId));
        }

        public List<UserGroupID> getUsrgrps() {
            return usrgrps;
        }

        public void setPasswd( final String passwd )
        {
            this.passwd = passwd;
        }

    }

}

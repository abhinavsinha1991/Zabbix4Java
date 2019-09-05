/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import java.util.List;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.usergroup.UserGroupID;
import com.zabbix4j.utils.ZbxListUtils;

public class UserUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public UserUpdateRequest() {
        setMethod("user.update");
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

        public void addUserGroupId( UserGroupID id) {
            usrgrps = ZbxListUtils.add(usrgrps, id);
        }

        public List<UserGroupID> getUserGroupIds() {
            return usrgrps;
        }

        public String getPasswd()
        {
            return passwd;
        }

        public void setPasswd( final String passwd )
        {
            this.passwd = passwd;
        }


    }

}

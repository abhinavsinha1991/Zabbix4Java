/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import java.util.List;
import com.zabbix4j.ZabbixApiRequest;
import com.zabbix4j.usergroup.PermissionObject;
import com.zabbix4j.usergroup.UserGroupObject;
import com.zabbix4j.utils.ZbxListUtils;

public class UserUpdateRequest extends ZabbixApiRequest {

    private Params params = new Params();

    public UserUpdateRequest() {
        setMethod("usergroup.update");
    }

    public Params getParams() {
        return params;
    }

    public void setParams(Params params) {
        this.params = params;
    }

    public class Params extends UserGroupObject {
        private List<PermissionObject> rights;
        private List<Integer> userids;

        public Params() {
            super();
        }

        public void addPermission(Integer hostgroupId, Integer permission) {
            rights = ZbxListUtils.add(rights, new PermissionObject(hostgroupId, permission));
        }

        public void addUserId(Integer id) {
            userids = ZbxListUtils.add(userids, id);
        }

        public List<PermissionObject> getRights() {
            return rights;
        }

        public void setRights(List<PermissionObject> rights) {
            this.rights = rights;
        }

        public List<Integer> getUserids() {
            return userids;
        }

        public void setUserids(List<Integer> userids) {
            this.userids = userids;
        }

    }

}

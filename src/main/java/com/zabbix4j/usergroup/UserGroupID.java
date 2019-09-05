/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.usergroup;

/**
 * @author sinhaab
 */
public class UserGroupID
{
    private String usrgrpid;

    public UserGroupID( final String usrgrpId )
    {
        this.usrgrpid=usrgrpId;
    }

    /**
     * @return The usrgrpid.
     */
    public String getUsrgrpid()
    {
        return usrgrpid;
    }

    /**
     * @param usrgrpid The usrgrpid to set.
     */
    public void setUsrgrpid( final String usrgrpid )
    {
        this.usrgrpid = usrgrpid;
    }
}

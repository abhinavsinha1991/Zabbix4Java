/*
 * Copyright (c) 2019 Abhinav Sinha
 */

package com.zabbix4j.user;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import com.zabbix4j.ZabbixApiTestBase;

/**
 * Created by Abhinav Sinha on 2019/09/05.
 */
public class UserGetTest extends ZabbixApiTestBase
{
    public UserGetTest()
    {
        super();
    }

    @Test
    public void testGetByGroupId() throws Exception
    {
        UserGetRequest request = new UserGetRequest();
        UserGetRequest.Params params = request.getParams();
        /*params.setName("user create test");*/
        params.addUsrgrpId( 7 );

        UserGetResponse response = zabbixApi.user().get( request );

        assertNotNull( response );

        System.out.println( response.getResult() );
    }

    @Test
    public void testGetByUserId() throws Exception
    {
        UserGetRequest request = new UserGetRequest();
        UserGetRequest.Params params = request.getParams();
        /*params.setName("user create test");*/
        params.addUserId( 1 );

        UserGetResponse response = zabbixApi.user().get( request );

        assertNotNull( response );

        System.out.println( response.getResult() );
    }
}

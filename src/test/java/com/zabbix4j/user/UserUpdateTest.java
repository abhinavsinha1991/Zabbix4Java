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
public class UserUpdateTest extends ZabbixApiTestBase
{
    public UserUpdateTest()
    {
        super();
    }

    @Test
    public void testUpdate1() throws Exception
    {
        UserUpdateRequest request = new UserUpdateRequest();
        UserUpdateRequest.Params params = request.getParams();
        /*params.setName("user create test");*/
        params.setUserid( 22 );
        params.setPasswd( "123456" );

        UserUpdateResponse response = zabbixApi.user().update( request );

        assertNotNull( response );

        System.out.println( response.getResult().getUserIds());
    }
}

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
public class UserDeleteTest extends ZabbixApiTestBase
{
    public UserDeleteTest()
    {
        super();
    }

    @Test
    public void testDeleteByUserId() throws Exception
    {
        UserDeleteRequest request = new UserDeleteRequest();
        /*params.setName("user create test");*/
        request.getParams().add( 18 );

        UserDeleteResponse response = zabbixApi.user().delete( request );

        assertNotNull( response );

        System.out.println( response.getResult().getUserIds() );
    }
}

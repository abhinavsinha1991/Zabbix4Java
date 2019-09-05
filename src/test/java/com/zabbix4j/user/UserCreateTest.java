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
public class UserCreateTest extends ZabbixApiTestBase {
    public UserCreateTest() {
        super();
    }

    @Test
    public void testCreate1() throws Exception {
        UserCreateRequest request = new UserCreateRequest();
        UserCreateRequest.Params params = request.getParams();
        /*params.setName("user create test");*/
        params.addUserGroups( "7" );
        params.setAlias( "abhinav123456" );
        params.setPasswd( "1234" );
        params.setType( 3 );

        UserCreateResponse response = zabbixApi.user().create(request);

        assertNotNull(response);

        System.out.println(response.getResult().getUsrIds());
    }
}

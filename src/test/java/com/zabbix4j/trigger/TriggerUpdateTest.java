/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014 Suguru Yajima
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.zabbix4j.trigger;

import com.zabbix4j.ZabbixApiException;
import com.zabbix4j.ZabbixApiTestBase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Suguru Yajima on 2014/05/12.
 */
public class TriggerUpdateTest extends ZabbixApiTestBase {

    public TriggerUpdateTest() {
        super();
    }

    @Test
    public void testUpdate1() throws Exception {

        Integer expectedid = createDummyTrigger();

        TriggerUpdateRequest request = new TriggerUpdateRequest();
        TriggerUpdateRequest.Params params = request.getParams();
        params.setTriggerid(expectedid);
        params.setDescription("Trigger Updated");
        params.setComments("Trigger Update Test");

        TriggerUpdateResponse response = zabbixApi.trigger().update(request);

        assertNotNull(response);

        Integer actualid = response.getResult().getTriggerids().get(0);
        assertEquals(expectedid, actualid);
    }

    private Integer createDummyTrigger() throws ZabbixApiException {

        TriggerCreateRequest request = new TriggerCreateRequest();
        TriggerCreateRequest.Params params = request.getParams();
        params.setComments("trigger udpate comment");
        params.setDescription("triggger udpate description");
        params.setExpression("{test host created1:vm.memory.size[available].last()}>0");

        TriggerCreateResponse response = zabbixApi.trigger().create(request);

        Integer triggerId = response.getResult().getTriggerids().get(0);

        return triggerId;
    }
}

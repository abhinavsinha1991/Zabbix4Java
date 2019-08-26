
package com.zabbix4j;

/**
 * @author Abhinav
 */
public class ZabbixAPIRunner
{
    public static void main( String[] args ) throws ZabbixApiException
    {
        //ZabbixApi zabbixApi= new ZabbixApi( "http://<zabbix server IP>/zabbix/api_jsonrpc.php" );
        ZabbixApi zabbixApi= new ZabbixApi( "http://zabbix.local/api_jsonrpc.php" );
        zabbixApi.login( "root","pass123" );


    }
}

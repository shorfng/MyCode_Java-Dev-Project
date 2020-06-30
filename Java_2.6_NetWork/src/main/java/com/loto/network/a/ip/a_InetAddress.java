package com.loto.network.a.ip;

import java.io.IOException;
import java.net.InetAddress;

/**
 * Author：蓝田_Loto
 * Date：2018-12-27 20:35
 * PageName：a_InetAddress.java
 * Function：JDK提供 InetAdderss 类（封装了一个IP地址）
 */

public class a_InetAddress {
    public static void main(String[] args) throws IOException {
        InetAddress localIP = InetAddress.getLocalHost();            // 获取本地主机ip对象
        //InetAddress IP = InetAddress.getByName("192.168.107.32");  // 获取固定ip对象

        // 获取本地ip地址
        String hostAddress = localIP.getHostAddress();
        System.out.println("ip:" + hostAddress); // ip:192.168.175.1

        // 获取本地主机名
        String hostName = localIP.getHostName();
        System.out.println(hostName); // TD
    }
}

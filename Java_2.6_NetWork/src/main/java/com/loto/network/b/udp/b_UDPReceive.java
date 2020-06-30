package com.loto.network.b.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * Author：蓝田_Loto
 * Date：2018-12-28 15:34
 * PageName：b_UDPReceive.java
 * Function：UDP接收端
 */

public class b_UDPReceive {
    public static void main(String[] args) throws IOException {
        // 1、创建DatagramSocket对象,并指定端口号
        DatagramSocket receiveSocket = new DatagramSocket(12306);

        // 2、创建DatagramPacket对象, 创建一个空的仓库
        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer, 1024);

        // 3、接收数据存储到DatagramPacket对象中
        receiveSocket.receive(dp);

        // 4、获取DatagramPacket对象的内容
        // 显示ip地址
        InetAddress ipAddress = dp.getAddress();  // 谁发来的数据  getAddress()
        String ip = ipAddress.getHostAddress();   // 获取到了IP地址
        System.out.println("IP地址：" + ip);

        // 显示收到的数据
        byte[] data = dp.getData();  // 发来了什么数据 getData()
        int length = dp.getLength(); // 发来了多少数据 getLenth()
        String dataStr = new String(data, 0, length);
        System.out.println("接受到的数据：" + dataStr);

        // 5、释放流资源
        receiveSocket.close();
    }
}

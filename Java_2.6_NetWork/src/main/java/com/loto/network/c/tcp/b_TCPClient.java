package com.loto.network.c.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * Author：蓝田_Loto
 * Date：2018-12-28 16:17
 * PageName：b_TCPClient.java
 * Function：TCP 客户端
 */

public class b_TCPClient {
    public static void main(String[] args) throws IOException {
        // 1、创建客户端Socket对象,（指定要连接的服务器地址与端口号）
        Socket s = new Socket("192.168.31.197", 8888);

        // 2、获取服务器端的反馈回来的信息
        InputStream in = s.getInputStream();
        byte[] buffer = new byte[1024];                            // 获取获取流中的数据
        int length = in.read(buffer);                              // 把流中的数据存储到数组中，并记录读取字节的个数
        System.out.println(new String(buffer, 0, length));   // 显示数据

        // 3、关闭流资源
        in.close();
        s.close();
    }
}

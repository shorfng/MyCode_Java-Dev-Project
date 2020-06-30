package com.loto.network.c.tcp;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author：蓝田_Loto
 * Date：2018-12-28 16:28
 * PageName：c_FileUpload_TCPServer.java
 * Function：文件上传_服务器端
 */

public class c_FileUpload_TCPServer {
    public static void main(String[] args) throws IOException {
        // 1、创建服务器，等待客户端连接
        ServerSocket serverSocket = new ServerSocket(8888);
        Socket clientSocket = serverSocket.accept();
        // 显示哪个客户端Socket连接上了服务器
        InetAddress ipObject = clientSocket.getInetAddress();  // 得到IP地址对象
        String ip = ipObject.getHostAddress();                 // 得到IP地址字符串
        System.out.println("连接IP:" + ip);

        // 7、获取Socket的输入流
        InputStream in = clientSocket.getInputStream();

        // 8、创建目的地的字节输出流
        BufferedOutputStream fileOut = new BufferedOutputStream(new FileOutputStream("Java_2.6_NetWork/src/main/resources/TD.jpg"));

        // 9、把Socket输入流中的数据，写入目的地的字节输出流中
        byte[] buffer = new byte[1024];
        int len = -1;
        while ((len = in.read(buffer)) != -1) {
            //写入目的地的字节输出流中
            fileOut.write(buffer, 0, len);
        }

        //-----------------反馈信息---------------------
        // 10、获取Socket的输出流, 作用：写反馈信息给客户端
        OutputStream out = clientSocket.getOutputStream();

        // 11、写反馈信息给客户端
        out.write("图片上传成功".getBytes());

        out.close();
        fileOut.close();
        in.close();
        clientSocket.close();
        //serverSocket.close();
    }
}
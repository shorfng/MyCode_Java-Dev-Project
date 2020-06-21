package com.loto.io.b.bytestream.e.BufferedOutputStream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 13:21
 * PageName：a_BufferedInputStream_usage.java
 * Function：BufferedOutputStream（字节缓冲输出流/缓冲流/高效流）
 */

public class a_BufferedOutputStream_usage {
    public static void main(String[] args) throws IOException {
        // 1、创建基本的字节输出流
        FileOutputStream fileOut = new FileOutputStream("Java_1.6_IO/src/main/resources/BufferedOutputStream.txt");
        // 使用高效的流，把基本的流进行封装，实现速度的提升
        BufferedOutputStream out = new BufferedOutputStream(fileOut);

        // 2、写数据
        out.write("hello".getBytes());

        // 3、关闭流
        out.close();
    }
}
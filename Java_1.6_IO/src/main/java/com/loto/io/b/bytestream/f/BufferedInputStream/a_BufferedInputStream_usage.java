package com.loto.io.b.bytestream.f.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 13:42
 * PageName：a_BufferedInputStream_usage.java
 * Function：BufferedInputStream（字节缓冲输入流/缓冲流/高效流）
 */

public class a_BufferedInputStream_usage {
    public static void main(String[] args) throws IOException {
        // 1、创建缓冲流对象
        FileInputStream fileIn = new FileInputStream("Java_1.6_IO/src/main/resources/BufferedOutputStream.txt");
        // 把基本的流包装成高效的流
        BufferedInputStream in = new BufferedInputStream(fileIn);

        // 2、读数据
        int ch;
        while ((ch = in.read()) != -1) {
            System.out.print((char) ch);
        }

        // 3、关闭
        in.close();
    }
}
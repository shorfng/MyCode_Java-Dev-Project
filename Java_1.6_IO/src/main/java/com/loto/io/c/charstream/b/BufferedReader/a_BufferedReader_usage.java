package com.loto.io.c.charstream.b.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 16:37
 * PageName：a_BufferedReader_usage.java
 * Function：BufferedReader（字符缓冲输入流/缓冲流/高效流）
 */

public class a_BufferedReader_usage {
    public static void main(String[] args) throws IOException {
        // 创建输入缓冲流对象
        BufferedReader br = new BufferedReader(new FileReader("Java_1.6_IO/src/main/resources/BufferedWriter.txt"));

        // 一次读写一个字符
        //int ch;
        //while ((ch = br.read()) != -1) {
        //    System.out.print((char) ch);
        //}

        // 一次读写一个字符数组
        //char[] chs = new char[1024];
        //int len;
        //while ((len = br.read(chs)) != -1) {
        //    System.out.print(new String(chs, 0, len));
        //}

        // 一次读取文本中一行的字符串内容
        String line = null;
        while( (line = br.readLine()) != null ){
            System.out.println(line);
        }

        // 释放资源
        br.close();
    }
}

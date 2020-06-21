package com.loto.io.c.charstream.a.BufferedWriter;

import java.io.*;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 14:29
 * PageName：a_BufferedWriter_usage.java
 * Function：BufferedWriter（字符缓冲输出流/缓冲流/高效流）
 */

public class a_BufferedWriter_usage {
    public static void main(String[] args) throws IOException {
        // 创建输出缓冲流对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("Java_1.6_IO/src/main/resources/BufferedWriter.txt"));

        // 换行输入
        for (int i=0; i<5; i++) {
            bw.write("hello");
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}

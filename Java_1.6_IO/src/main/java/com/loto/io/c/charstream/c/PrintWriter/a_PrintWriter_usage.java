package com.loto.io.c.charstream.c.PrintWriter;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 16:43
 * PageName：a_PrintWriter_usage.java
 * Function：PrintWriter（字符打印流）
 */

public class a_PrintWriter_usage {
    public static void main(String[] args) throws IOException {
        // 创建流，开启文件自动刷新写入功能
        //PrintWriter out = new PrintWriter(new FileWriter("Java_1.6_IO/src/main/resources/PrintWriter.txt" ,true));

        // 创建流
        PrintWriter out = new PrintWriter("Java_1.6_IO/src/main/resources/PrintWriter.txt");

        // 写数据
        for (int i = 0; i < 5; i++) {
            out.println("helloWorld");
        }

        // 关闭流
        out.close();
    }
}

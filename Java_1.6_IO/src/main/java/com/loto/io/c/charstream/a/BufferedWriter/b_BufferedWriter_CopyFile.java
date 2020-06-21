package com.loto.io.c.charstream.a.BufferedWriter;

import java.io.*;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 15:17
 * PageName：b_BufferedWriter_CopyFile.java
 * Function：复制文件
 */

public class b_BufferedWriter_CopyFile {
    public static void main(String[] args) throws IOException {
        // 1、指定数据源，是数据源中读数据，采用输入流
        BufferedReader in = new BufferedReader(new FileReader("Java_1.6_IO/src/main/resources/BufferedWriter.txt"));

        // 2、指定目的地，是把数据写入目的地，采用输出流
        BufferedWriter out = new BufferedWriter(new FileWriter("Java_1.6_IO/src/main/resources/BufferedWriterCopy.txt"));

        // 3、读数据
        String line;
        while ((line = in.readLine()) != null) {
            out.write(line); // 写数据
            out.newLine();   // 写入换行符号
        }

        // 4、关闭流
        out.close();
        in.close();
    }
}

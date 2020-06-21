package com.loto.io.c.charstream.d.OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 15:43
 * PageName：a_OutputStreamWriter_usage.java
 * Function：OutputStreamWriter（转换流 - 输出）字符 ->字节
 */

public class a_OutputStreamWriter_usage {
    public static void main(String[] args) throws IOException {
        // 创建与文件关联的字节输出流对象
        FileOutputStream fos = new FileOutputStream("Java_1.6_IO/src/main/resources/OutputStreamWriter.txt");
        // 创建可以把字符转成字节的转换流对象，并指定编码
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf-8");

        // 调用转换流，把文字写出去，其实是写到转换流的高效区中
        osw.write("你好"); //写入高效区
        osw.close();
    }
}

package com.loto.io.c.charstream.e.InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 15:55
 * PageName：a_InputStreamReader_usage.java
 * Function：InputStreamReader（转换流 - 输入）字节 ->字符
 */

public class a_InputStreamReader_usage {
    public static void main(String[] args) throws IOException {
        //创建读取文件的字节流对象
        InputStream in = new FileInputStream("Java_1.6_IO/src/main/resources/OutputStreamWriter.txt");

        //创建转换流对象
        // InputStreamReader isr = new InputStreamReader(in);这样创建对象，会用本地默认码表读取，将会发生错误解码的错误
        InputStreamReader isr = new InputStreamReader(in, "utf-8");

        //使用转换流去读字节流中的字节
        int ch;
        while ((ch = isr.read()) != -1) {
            System.out.println((char) ch);
        }

        //关闭流
        isr.close();
    }
}

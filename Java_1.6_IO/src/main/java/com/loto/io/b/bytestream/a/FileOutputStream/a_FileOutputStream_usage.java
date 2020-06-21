package com.loto.io.b.bytestream.a.FileOutputStream;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-22 13:45
 * PageName：a_FileOutputStream_usage.java
 * Function：FileOutputStream_字节输出流
 */

public class a_FileOutputStream_usage {
    public static void main(String[] args) throws IOException {
       function_1();
       function_2();
    }

    // 覆盖原文件
    private static void function_1() throws IOException {
        // 创建一个用于操作文件的字节输出流对象，一创建就必须明确数据存储目的地，如果没有该文件则会自动创建，如果文件存在，则覆盖
        FileOutputStream fos = new FileOutputStream("Java_1.6_IO/src/main/resources/FileOutputStream.txt");

        // 写出数据（调用父类中的write方法）
        byte[] data = "abcd-".getBytes();
        fos.write(data);
        fos.write(97);  // 97转换成字节流为a

        // 关闭资源
        fos.close();
    }


    // 续写
    private static void function_2() throws IOException {
        FileOutputStream fos = new FileOutputStream("Java_1.6_IO/src/main/resources/FileOutputStream.txt",true);

        // 写出数据
        String str = "\r\n"+"111";
        fos.write(str.getBytes());

        fos.write(98);  // b
        fos.write(99);  // c
        fos.write(100); // d
        fos.write(101); // e

        // 关闭流资源
        fos.close();
    }
}

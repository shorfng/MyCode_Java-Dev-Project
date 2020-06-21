package com.loto.io.c.charstream.f.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-22 18:39
 * PageName：a_FileWriter_usage.java
 * Function：FileWriter_使用
 */

public class a_FileWriter_usage {
    public static void main(String[] args) throws IOException {
        // 步骤1：创建输出流对象
        // FileWriter fw = new FileWriter("e:\\a.txt"); // Win系统下绝对路径
        // FileWriter fw = new FileWriter("/Users/TD/Desktop//a.txt"); // Mac系统下绝对路径
        FileWriter fw = new FileWriter("Java_1.6_IO/src/main/resources/FileWriter.txt"); // 相对路径

        // 步骤2：调用输出流对象的写数据的方法
        fw.write("hello");

        // 步骤3：刷新缓冲区（刷新该流的缓冲，把内存缓冲区中的数据刷新到文件中，流对象还可以继续使用）
        fw.flush();

        // 步骤4：释放资源（先刷新缓冲区，然后通知系统释放和该文件相关的资源，流对象不可以再被使用了）
        fw.close();
    }
}

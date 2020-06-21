package com.loto.io.c.charstream.g.FileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-22 20:21
 * PageName：b_FileReader_copyFile.java
 * Function：复制文件
 */

public class b_FileReader_copyFile {
    public static void main(String[] args) throws IOException {
        copyFileByte();
        copyFileArray();

    }

    // 复制文件：一次一个字符
    private static void copyFileByte() throws IOException {
        // 创建两个对象
        FileReader fr = new FileReader("Java_1.6_IO/src/main/resources/FileWriter.txt");
        FileWriter fw = new FileWriter("Java_1.6_IO/src/main/resources/FileWriterCopy.txt");

        // 一边读取一边写入
        int r;
        while ((r = fr.read()) != -1) {
            fw.write(r);
            fw.flush();
        }

        // 关闭资源
        fw.close();
        fr.close();
    }

    // 复制文本文件: 一次读写一个字符数组复制文本文件
    private static void copyFileArray() throws IOException {
        // 创建对象
        FileReader fr = new FileReader("Java_1.6_IO/src/main/resources/FileWriter.txt");
        FileWriter fw = new FileWriter("Java_1.6_IO/src/main/resources/FileWriterCopy.txt");

        // 读取并写入
        char[] chs = new char[1024];

        int len;
        while ((len = fr.read(chs)) != -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }

        // 关闭资源
        fw.close();
        fr.close();
    }
}

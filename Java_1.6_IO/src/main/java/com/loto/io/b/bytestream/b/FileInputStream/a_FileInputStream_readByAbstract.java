package com.loto.io.b.bytestream.b.FileInputStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-22 14:28
 * PageName：a_FileInputStream_readByAbstract.java
 * Function：读取数据（通过抽象方法）
 */

// [abstract int] read( )
public class a_FileInputStream_readByAbstract {
    public static void main(String[] args) throws IOException {
        System.out.println("=============== 读取一个字节 ================");
        readByte();

        System.out.println("============= 读取文件全部内容 ===============");
        readAll();
    }

    // 读取一个字节
    private static void readByte() throws IOException {
        FileInputStream fis = new FileInputStream("Java_1.6_IO/src/main/resources/FileOutputStream.txt");

        // 读取一个字节
        int i = fis.read();  // i 表示读取到的数据
        System.out.println("读取到的数据：" + i);

        char ch = (char) i;  //  基本的类型强制转换
        System.out.println("实际内容：" + ch);

        // 关闭资源
        fis.close();
    }

    // 读取文件全部内容
    private static void readAll() throws IOException {
        FileInputStream fis = new FileInputStream("Java_1.6_IO/src/main/resources/FileOutputStream.txt");

        // 读取文件
        int j;
        while ((j = fis.read()) != -1) {
            System.out.print((char) j);
        }

        // 关闭资源
        fis.close();
    }
}

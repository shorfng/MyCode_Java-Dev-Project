package com.loto.io.c.charstream.g.FileReader;

import java.io.FileReader;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-22 19:38
 * PageName：a_FileReader_usage.java
 * Function：FileReader_使用
 */

public class a_FileReader_usage {
    public static void main(String[] args) throws IOException {
        readByByte();
        readByChar();
        readByEffect();
    }

    // 一次读取一个字符
    private static void readByByte() throws IOException {
        // 创建fr对象
        FileReader fr = new FileReader("Java_1.6_IO/src/main/resources/FileWriter.txt");

        // 读取数据(一次读取一个字符)
        // 当数据读取完毕时，返回的结果是-1
        int r = fr.read();
        System.out.println(r);

        r = fr.read();
        System.out.println(r);

        r = fr.read();
        System.out.println(r);

        // 关闭资源
        fr.close();
    }

    // 循环读取数据
    private static void readByChar() throws IOException {
        // 创建fr对象
        FileReader fr = new FileReader("Java_1.6_IO/src/main/resources/FileWriter.txt");

        // 读取数据（使用循环）
        // （1）使用 fr.read() 读取一个字符，并返回这个字符
        // （2）把返回的这个字符赋值给r
        // （3）判断 r != -1的真假
        int r;
        while ((r = fr.read()) != -1) {
            System.out.print((char) r); // 使用char强制转换成字符
        }

        while (fr.read() != -1) {
            System.out.print(fr.read()); // 使用char强制转换成字符
        }

        // 关闭资源
        fr.close();
    }

    // 高效读取数据
    private static void readByEffect() throws IOException {
        // 创建fr对象
        FileReader fr = new FileReader("Java_1.6_IO/src/main/resources/FileWriter.txt");

        // 读取数据
        // 创建一个数组用来存放数据
        // 当数据读取完毕的时候，返回值为-1
        char[] chs = new char[1024]; // 一般是1024或1024的整数倍
        int len;

        // 使用 fr.read(chs) 读取数据，把读取到的数据存放在chs数组中
        // 把 fr.read(chs) 这次读取数据的个数赋值给len
        // 判断 len ！= -1 的真假
        while ((len = fr.read(chs)) != -1) {
            while ((len = fr.read(chs)) != -1) {
                System.out.print(new String(chs, 0, len));
            }
        }
    }
}

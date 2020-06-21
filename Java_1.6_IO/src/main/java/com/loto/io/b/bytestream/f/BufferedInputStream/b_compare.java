package com.loto.io.b.bytestream.f.BufferedInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 13:59
 * PageName：b_compare.java
 * Function：读取文件效率对比（缓冲流与普通流）
 */

public class b_compare {
    public static void main(String[] args) throws IOException {
        fun1();  // 普通字节流   4303毫秒
        fun2();  // 缓冲流      8毫秒
        fun3();  // 普通数组    1毫秒
        fun4();  // 缓冲流数组  1毫秒
    }

    private static void fun1() throws IOException {
        // 使用 FileInputStream 读取文件
        FileInputStream fis = new FileInputStream("Java_1.6_IO/src/main/resources/bg.jpg");
        long start = System.currentTimeMillis();

        int b;
        while ((b = fis.read()) != -1) {

        }

        fis.close();
        long end = System.currentTimeMillis();

        System.out.println("FileInputStream 读取文件的时间:" + (end - start) + "毫秒"); // 4303毫秒
    }

    private static void fun2() throws IOException {
        // 创建缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Java_1.6_IO/src/main/resources/bg.jpg"));
        long start = System.currentTimeMillis();

        int b;
        while ((b = bis.read()) != -1) {

        }

        bis.close(); // 关闭资源的时候 ,只需要关闭 缓冲流即可.
        long end = System.currentTimeMillis();

        System.out.println("BufferedInputStream 读取文件的时间:" + (end - start) + "毫秒"); // 8毫秒
    }

    private static void fun3() throws IOException {
        FileInputStream fis = new FileInputStream("Java_1.6_IO/src/main/resources/bg.jpg");
        long start = System.currentTimeMillis();
        byte[] b = new byte[8 * 1024];

        int len;
        while ((len = fis.read(b)) != -1) {

        }

        fis.close();
        long end = System.currentTimeMillis();

        System.out.println("FileInputStream 使用数组 读取文件的时间:" + (end - start) + "毫秒"); // 1毫秒
    }


    private static void fun4() throws IOException {
        // 创建缓冲流对象
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Java_1.6_IO/src/main/resources/bg.jpg"));
        long start = System.currentTimeMillis();
        byte[] b = new byte[8 * 1024];

        int len;
        while ((len = bis.read(b)) != -1) {

        }

        bis.close();

        long end = System.currentTimeMillis();
        System.out.println("BufferedInputStream 使用数组 读取文件的时间:" + (end - start) + "毫秒"); // 1毫秒
    }
}
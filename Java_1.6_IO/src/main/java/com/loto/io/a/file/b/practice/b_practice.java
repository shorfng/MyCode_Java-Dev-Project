package com.loto.io.a.file.b.practice;

import java.io.File;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-21 18:42
 * PageName：b_practice.java
 */

/*
构造一个File对象，指向resources目录下的demo02.txt（此文件不存在）
（1）判断，如果文件不存在，就创建这个文件，打印创建结果
（2）判断这个File对象是否是一个文件，打印结果
（3）判断这个File对象是否是一个目录，打印结果
（4）删除这个文件
*/

public class b_practice {
    public static void main(String[] args) throws IOException {
        File file = new File("Java_1.6_IO/src/main/resources/File_practice2.txt");

        // 判断，如果文件不存在，就创建这个文件，打印创建结果
        if (!file.exists()) {
            boolean b = file.createNewFile();
            System.out.println(b);
        }

        // 判断是否是文件
        if (file.isFile()) {
            System.out.println("是一个文件");
        } else {
            System.out.println("不是一个文件");
        }

        // 判断是否是目录
        if (file.isDirectory()) {
            System.out.println("是一个目录");
        } else {
            System.out.println("不是一个目录");
        }
    }
}

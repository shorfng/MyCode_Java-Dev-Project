package com.loto.io.a.file.b.practice;

import java.io.File;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-21 18:49
 * PageName：c_practice.java
 */

/*
构造一个File对象，创建目录
1、获取此目录下所有的文件/目录的名称，并打印(list())
2、获取此目录下所有的文件/目录的File对象，遍历这个数组，获取每个File对象
（1）判断：如果是文件
（2）打印：”文件(绝对路径)”
（3）否则，打印：”目录(绝对路径)
*/

public class c_practice {
    public static void main(String[] args) throws IOException {
        File dirs = new File("D:\\TD");
        dirs.mkdirs();

        File file = new File("D:\\TD\\1.txt");
        file.createNewFile();

        // 获取此目录下所有的文件/目录的名称
        String[] list = dirs.list();
        if (list != null) {
            for (String string : list) {
                System.out.println(string);
            }
        }

        // 获取此目录下所有的文件/目录的File对象
        File[] listFiles = dirs.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    System.out.println("这个是目录");
                    System.out.println(file2.getPath());
                } else {
                    System.out.println("这是一个文件");
                    System.out.println(file2.getAbsolutePath());
                }
            }
        }
    }
}
package com.loto.io.a.file.b.practice;

import java.io.File;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-21 18:31
 * PageName：a_practice.java
 */

/*
1、在resources下建立文件：File_practice1.txt，里面添加一些内容
2、使用这个文件构造一个File对象，调用File的相关方法获取以下信息：
（1）文件的绝对路径
（2）文件名
（3）文件大小
（4）此File对象的路径名
*/

public class a_practice {
    public static void main(String[] args) throws IOException {
        File file = new File("Java_1.6_IO/src/main/resources/File_practice1.txt");
        file.createNewFile();

        // 1、文件的绝对路径
        String absolutePath = file.getAbsolutePath();
        System.out.println("文件的绝对路径：" + absolutePath);

        // 2、文件名字
        String name = file.getName();
        System.out.println("文件的名字：" + name);

        // 3、文件的大小
        long totalSpace = file.getTotalSpace();
        System.out.println("文件的大小：" + totalSpace);

        // 4、此File对象的路径名
        String path = file.getPath();
        System.out.println("文件的路径名：" + path);
    }
}

package com.loto.io.a.file.b.practice;

import java.io.File;

/**
 * Author：蓝田_Loto
 * Date：2018-12-23 12:41
 * PageName：d_practice.java
 * Function：判断一个路径，如果不是文件夹，并且是.java文件，那么把文件更改为.txt文件
 */

public class d_practice {
    public static void main(String[] args) {
        String path = "Java_1.6_IO/src/main/resources/File_practice3.java";

        // 封装为文件对象
        File file = new File(path);
        if (file.isDirectory()) {
            System.out.println("这是文件夹");
        } else {
            String name = file.getAbsolutePath();
            // 判断文件名
            if (name.endsWith(".java")) {
                // 新文件的名字
                String newName = name.replace(".java", ".txt");
                // 创建新文件对象
                File newFile = new File(newName);
                boolean b = file.renameTo(newFile);  // 重命名

                System.out.println("修改成功？" + b);
            } else {
                System.out.println("不是.java文件");
            }
        }
    }
}

package com.loto.io.a.file.a.use;

import java.io.File;

/**
 * Author：蓝田_Loto
 * Date：2018-12-21 17:18
 * PageName：d_Ergodic.java
 * Function：File类_遍历指定目录下的所有文件
 */

public class d_Ergodic {
    public static void main(String[] args) {
        File file = new File("d:\\TD");
        File[] listFiles = file.listFiles();

        if (listFiles != null) {
            for (File f : listFiles) {
                if (f.isDirectory()) {
                    // 文件夹
                    File[] listFiles2 = f.listFiles();
                    if (listFiles2 != null) {
                        for (File f2 : listFiles2) {
                            String absolutePath = f2.getAbsolutePath();
                            System.out.println(absolutePath);
                        }
                    }
                } else {
                    // 文件
                    String absolutePath = f.getAbsolutePath();
                    System.out.println(absolutePath);
                }
            }
        }
    }
}

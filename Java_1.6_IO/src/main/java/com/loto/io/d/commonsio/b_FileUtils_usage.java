package com.loto.io.d.commonsio;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-24 18:44
 * PageName：b_FileUtils_usage.java
 * Function：FileUtils（提供文件操作的方法）
 */

public class b_FileUtils_usage {
    public static void main(String[] args) throws IOException {
        // 通过Commons-IO完成了文件复制的功能
        FileUtils.copyFile(new File("Java_1.6_IO/src/main/resources/TD.jpg"), new File("Java_1.6_IO/src/main/resources/TDCopy.jpg"));

        // 通过Commons-IO完成了文件夹复制的功能
        FileUtils.copyDirectoryToDirectory(new File("Java_1.6_IO/src/main/resources/File"), new File("Java_1.6_IO/src/main/resources/FileCopy"));
    }
}

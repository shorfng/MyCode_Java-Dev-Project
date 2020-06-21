package com.loto.io.d.commonsio;

import org.apache.commons.io.FilenameUtils;
/**
 * Author：蓝田_Loto
 * Date：2018-12-24 18:07
 * PageName：a_FilenameUtils_usage.java
 * Function：FilenameUtils（解决不同操作系统文件名称规范不同的问题）
 */

public class a_FilenameUtils_usage {
    public static void main(String[] args) {
        // 获取文件的扩展名
        String extension = FilenameUtils.getExtension("Java_1.6_IO/src/main/resources/bg.jpg");
        System.out.println(extension);

        // 判断fileName是否是xxx的后缀名
        boolean extension2 = FilenameUtils.isExtension("Java_1.6_IO/src/main/resources/TD.jpg", "jpg");
        System.out.println(extension2);
    }
}

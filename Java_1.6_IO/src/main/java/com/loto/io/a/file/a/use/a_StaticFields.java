package com.loto.io.a.file.a.use;

import java.io.File;

/**
 * Author：蓝田_Loto
 * Date：2018-12-21 13:18
 * PageName：a_StaticFields.java
 * Function：File类_静态成员变量
 */

public class a_StaticFields {
    public static void main(String[] args) {
        // [String] pathSeparator  与系统有关的路径分隔符
        String separator = File.pathSeparator;
        System.out.println(separator);  // 目录的分割，win系统是一个分号, Linux系统下是冒号

        // [String] separator 与系统有关的默认名称分隔符
        separator = File.separator;
        System.out.println(separator);  // 目录名称分割，win系统是向右 \ Linux系统下是向左 /
    }
}

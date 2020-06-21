package com.loto.io.a.file.a.use;

import java.io.File;

/**
 * Author：蓝田_Loto
 * Date：2018-12-21 13:23
 * PageName：b_ConstructMethod.java
 * Function：File类_构造方法
 */

public class b_ConstructMethod {
    public static void main(String[] args) {
        System.out.println("====== File(String pathname) ======");
        function_1();

        System.out.println("====== File(String parent,String child) ======");
        function_2();

        System.out.println("====== File(File parent,String child) ======");
        function_3();
    }

    // File(String pathname)   传递路径名，将路径封装File类型对象，可以写到文件夹,可以写到一个文件
    private static void function_1() {
        File file1 = new File("d:\\win");    // win系统
        File file2 = new File("/Users/mac"); // mac系统

        System.out.println(file1);
        System.out.println(file2);
    }

    // File(String parent,String child)  传递路径，传递字符串父路径，字符串子路径
    // 好处: 单独操作父路径和子路径
    private static void function_2() {
        File file1 = new File("d:", "win");
        File file2 = new File("/Users", "mac");

        System.out.println(file1);
        System.out.println(file2);
    }

    // File(File parent,String child)  传递路径，传递File类型父路径，字符串子路径
    // 好处:父路径是File类型，父路径可以直接调用File类方法
    private static void function_3() {
        File parent1 = new File("d:");
        File file1 = new File(parent1, "win");

        File parent2 = new File("/Users");
        File file2 = new File(parent2, "mac");

        System.out.println(file1);
        System.out.println(file2);
    }
}
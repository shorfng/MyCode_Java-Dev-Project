package com.loto.io.a.file.a.use;

import java.io.File;
import java.io.IOException;

/**
 * Author：蓝田_Loto
 * Date：2018-12-21 14:53
 * PageName：c_MemberMethod.java
 * Function：File类_成员方法
 */

public class c_MemberMethod {
    public static void main(String[] args) throws IOException {
        System.out.println("====== mkdirs() 创建多层文件夹 ======");
        function_1();

        System.out.println("====== createNewFile()  创建的文件路径和文件名 ======");
        function_2();

        System.out.println("====== delete()  删除的文件或者是文件夹 ======");
        function_3();

        System.out.println("====== File类的获取功能 ======");
        function_4();

        System.out.println("====== 获取一个目录中的所有文件/文件夹 ======");
        function_5();
    }

    // File创建文件夹功能
    // [boolean] mkdirs()  创建多层文件夹（如果文件夹已经存在了，则不再创建）
    private static void function_1() {
        File dirs = new File("d:\\abc");
        boolean b = dirs.mkdirs();

        System.out.println(b);
    }

    // File创建文件的功能
    // [boolean] createNewFile()  创建的文件路径和文件名（如果文件已经存在了,则不再创建，如果路径错误，IOException）
    private static void function_2() throws IOException {
        File file = new File("d:\\abc\\a.txt");
        boolean b = file.createNewFile();

        System.out.println(b);
    }

    // File类的删除功能
    // [boolean] delete()  删除的文件或者是文件夹（删除成功返回true，删除失败返回false。删除方法,不走回收站,直接从硬盘中删除）
    private static void function_3() {
        File file = new File("d:\\abc\\a.txt");
        boolean b = file.delete();

        System.out.println(b);
    }

    // File类的获取功能
    private static void function_4() throws IOException {
        String s = "a.txt";
        File file = new File(s);
        final boolean b = file.createNewFile();
        System.out.println(b);

        System.out.println(file.getAbsolutePath()); // 获取绝对路径（存放在项目根目录）
        System.out.println(file.getPath());         // 获取路径
        System.out.println(file.getName());         // 获取文件名称
        System.out.println(file.length());          // 获取文件大小（byte 作为单位）

		// 获取当前项目的文件路径
		String fileName = Thread.currentThread().getContextClassLoader().getResource("config-product.properties").getPath();
		System.out.println(fileName);
    }

    // 获取一个目录中的所有文件夹下的所有文件
    private static void function_5() {
        File dir = new File("d:\\TD");
        boolean b = dir.mkdirs();
        System.out.println(b);

        // 获取的是目录下当前的文件和文件夹的名称
        String[] names = dir.list();
        if (names != null) {
            for (String name : names) {
                System.out.println(name);
            }
        }

        // 获取目录下当前文件和文件夹的绝对路径
        File[] files = dir.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println(file);
            }
        }
    }
}
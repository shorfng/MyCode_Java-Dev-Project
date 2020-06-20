package com.loto.api.f.scanner;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：a_Scanner_use.java
 * Function：Scanner_常用成员方法（获取键盘录入的字符串数据）
 */

public class a_Scanner_use {
    public static void main(String[] args) {
        // 1、创建对象
        Scanner sc = new Scanner(System.in);

        // 2、键盘录入整数 nextInt()
        System.out.println("输入数字：");
        int i = sc.nextInt();
        System.out.println("接收到的数字是：" + i);

        // 3、键盘录入字符串 next()
        // 在遇到空格的时候，会判定当前输入结束，空格之后的内容会收不到
        System.out.println("输入字符串：");
        String s1 = sc.next();
        System.out.println("接收到的字符串是：" + s1);

        System.out.println("==========================");

        // 4、键盘录入字符串 nextLine()
        // 可以避免被空格中断
        // 弊端：如果前面接收数字，后面使用nextLine()，会被干扰
        System.out.println("输入字符串：");
        String s2 = sc.nextLine();
        System.out.println("接收到的字符串是：" + s2);

        // 5、关闭流
        sc.close();
    }
}

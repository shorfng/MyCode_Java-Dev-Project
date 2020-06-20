package com.loto.api.f.scanner;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：c_Practice.java
 * Function：键盘录入三个数据获取最大值
 */

public class c_Practice {
    public static void main(String[] args) {
        // 1、创建对象
        Scanner sc = new Scanner(System.in);

        // 2、接收数据
        System.out.println("请输入第一个数据：");
        int a = sc.nextInt();
        System.out.println("请输入第二个数据：");
        int b = sc.nextInt();
        System.out.println("请输入第三个数据：");
        int c = sc.nextInt();

        // 3、获取三个数据的最大值
        int temp = (a > b ? a : b);
        int max = (temp > c ? temp : c);

        // 4、输出数据
        System.out.println("最大数是:" + max);

        // 5、关闭流
        sc.close();
    }
}

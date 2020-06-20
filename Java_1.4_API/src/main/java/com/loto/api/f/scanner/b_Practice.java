package com.loto.api.f.scanner;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：b_Practice.java
 * Function：键盘录入三个int类型的数字（求出三个数中的最小值并打印、求出三个数的和并打印）
 */

public class b_Practice {
    public static void main(String[] args) {
        // 1、创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请以此输入三个int类型的数字：");

        // 2、接收数据
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 3、求出三个数中的最小值并打印
        int temp = (a > b) ? a : b;
        int max = (temp > c) ? temp : c;
        System.out.println("最大数是：" + max);

        // 4、求出三个数的和并打印
        System.out.println("三个数的和：" + (a + b + c));

        // 5、关闭流
        sc.close();
    }
}

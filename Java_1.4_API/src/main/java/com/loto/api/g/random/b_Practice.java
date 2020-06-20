package com.loto.api.g.random;

import java.util.Random;
import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：b_Practice.java
 * Function：猜数字（系统产生一个1-100之间的随机数，请猜出这个数据是多少）
 */

public class b_Practice {
    public static void main(String[] args) {
        // 程序产生一个随机数
        Random rd = new Random();
        int randoNum = rd.nextInt(100) + 1;

        // 实例化一个键盘扫描输入对象
        Scanner sc = new Scanner(System.in);

        // 循环（直到猜对才停止猜数）
        while (true) {
            // 用户手动输入一个数字
            System.out.println("请输入要猜的数字：");
            int guessNum = sc.nextInt();

            // 比较系统产生的随机数（randoNum）与用户输入的数（guessNum）
            if (guessNum > randoNum) {
                System.out.println("猜的数字大了！");
            } else if (guessNum < randoNum) {
                System.out.println("猜的数字小了！");
            } else {
                System.out.println("恭喜！猜对了！");
                break; // 猜对了以后，跳出循环
            }
        }
        sc.close();
    }
}

package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：b_if_else.java
 * Function：if 语句的第2种格式 if(){ } else{ }
 */

public class b_if_else {
    public static void main(String[] args) {
        // 实例1：给定一个数字，判断是偶数还是奇数
        int a = 11;
        if (a % 2 == 1) {
            System.out.println("是奇数");
        } else {
            System.out.println("是偶数");
        }

        // 实例2：键盘输入一个数字，打印这个数字是奇数还是偶数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int b = sc.nextInt();

        if (b % 2 == 1) {
            System.out.println("该数字是奇数");
        } else {
            System.out.println("该数字是偶数");
        }
        sc.close();
    }
}

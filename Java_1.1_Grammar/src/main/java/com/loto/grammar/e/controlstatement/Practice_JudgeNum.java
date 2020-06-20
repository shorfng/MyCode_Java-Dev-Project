package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/*
 A.	请用户输入一个数字：
 B.	判断这个数字是否是“不是1—100之间的数字”：
		是：打印：此数字是1—100之间的数字；
		否：打印：此数字不是1—100之间的数字；
 */
public class Practice_JudgeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");

        int num = sc.nextInt();
        if (num >= 1 && num <= 100) {
            System.out.println("此数字是1-100之间的数字");
        } else {
            System.out.println("此数字不是1-100之间的数字");
        }
        sc.close();
    }
}
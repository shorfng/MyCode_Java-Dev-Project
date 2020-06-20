package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/* 键盘录入月份，输出对应的季节
（1）一年有四季;3,4,5春季;6,7,8夏季;9,10,11秋季;12,1,2冬季
（2）使用if语句实现
 */
public class Practice_Season_if {
	public static void main(String[] args) {
		// 键盘输入月份
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份（1-12）：");
		int month = sc.nextInt();

		// 通过输入的月份进行判断是哪个季节
		if (month >= 3 && month <= 5) {
			System.out.println("春季");
		} else if (month >= 6 && month <= 8) {
			System.out.println("夏季");
		} else if (month >= 9 && month <= 11) {
			System.out.println("秋季");
		} else if (month == 12 || month == 2 || month == 1) {
			System.out.println("冬季");
		} else {
			System.out.println("输入的月份不在1-12之间");
		}
		sc.close();
	}
}
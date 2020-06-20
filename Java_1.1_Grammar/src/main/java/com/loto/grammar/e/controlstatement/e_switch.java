package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：e_switch.java
 * Function：switch 循环语句
 */

// 根据键盘录入的数值 1、2、3...7 输出对应的星期一、星期二、星期三...星期日
public class e_switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入一个数字（1-7）：");
		int week = sc.nextInt();

		switch (week) {
		case 1:
			System.out.println("星期一");
			break;
		case 2:
			System.out.println("星期二");
			break;
		case 3:
			System.out.println("星期三");
			break;
		case 4:
			System.out.println("星期四");
			break;
		case 5:
			System.out.println("星期五");
			break;
		case 6:
			System.out.println("星期六");
			break;
		case 7:
			System.out.println("星期日");
			break;
		default:
			System.out.println("输入的数字不在1 - 7之间！！！");
			break;
		}
		sc.close();
	}
}

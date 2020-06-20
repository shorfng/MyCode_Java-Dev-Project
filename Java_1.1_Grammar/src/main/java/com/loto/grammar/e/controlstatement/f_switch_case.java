package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：f_switch_case.java
 * Function：switch case 循环语句
 */

public class f_switch_case {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数字（1-7）：");
		int week = sc.nextInt();

		switch (week) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("今天是工作日");
			break;
		case 6:
		case 7:
			System.out.println("今天是休息日");
			break;
		default:
			System.out.println("输入有误，请输入1-7的数字");
			break;
		}
		sc.close();
	}
}

package com.loto.grammar.e.controlstatement;

// case穿透

/* 键盘录入月份，输出对应的季节
（1）一年有四季;3,4,5春季;6,7,8夏季;9,10,11秋季;12,1,2冬季
（2）使用switch语句实现
 */
import java.util.Scanner;

public class Practice_Season_Switch {
	public static void main(String[] args) {
		// 键盘输入月份
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份（1-12）：");
		int month = sc.nextInt();

		// 判断键盘录入的月份是什么季节
		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋季");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬季");
			break;
		default:
			System.out.println("输入的月份不在1-12之间");
			break;
		}
		sc.close();
	}
}

package com.loto.grammar.e.controlstatement;

import java.util.Scanner;

/*
打印：“1. 求1—100的偶数和   2. 求1—100的奇数和：”
（1）接收用户输入，如果输入1：计算并打印1—100的所有偶数和；
（2）接收用户输入，如果输入2：计算并打印1—100的所有奇数和；
（3）要求：计算方式使用：while循环
 */

public class Practice_SumNum {
	public static void main(String[] args) {
		// 1、键盘输入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入1或者2:");
		int a = sc.nextInt();

		// 2、判断
		if (a == 1) { // 2.1 输入的是数字1，偶数和
			int j = 1;
			int evensum = 0;
			while (j <= 100) {
				if (j % 2 == 0) {
					evensum += j;
				}
				j++;
			}
			System.out.println("1-100的偶数和：" + evensum);
		} else if (a == 2) { // 2.2 输入的是数字2，奇数和
			int j = 1;
			int oddsum = 0;
			while (j <= 100) {
				if (j % 2 == 1) {
					oddsum += j;
				}
				j++;
			}
			System.out.println("1-100的偶数和：" + oddsum);
		} else {
			System.out.println("输入的数字不是1或2！！！");
		}
		// 3、关闭流
		sc.close();
	}
}


// 获取一个1-100之间(包含1和100)的随机数n
// 求2-n之间（包含2和n）偶数的个数，并打印到控制台上
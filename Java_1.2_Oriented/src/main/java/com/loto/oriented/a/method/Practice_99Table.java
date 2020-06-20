package com.loto.oriented.a.method;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：Practice_99Table.java
 * Function：键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表
 */

public class Practice_99Table {
	public static void main(String[] args) {
		// 键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数（1-9）:");
		int num = sc.nextInt();

		// 方法调用
		multiplicationTable(num);

		sc.close();
	}

	private static void multiplicationTable(int num) {
		System.out.println(num + " * " + num + " 乘法表如下：");
		System.out.println("================================");

		// 实现乘法表
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " * " + i + " = " + i * j + "\t");
			}
			System.out.println();
		}
	}
}

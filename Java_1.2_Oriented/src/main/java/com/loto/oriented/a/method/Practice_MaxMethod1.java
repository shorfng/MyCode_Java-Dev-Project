package com.loto.oriented.a.method;

import java.util.Scanner;

// 代码功能：键盘输入两个数，获取较大值
public class Practice_MaxMethod1 {
	public static void main(String[] args) {
	    // 键盘输入两个数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();

		// 调用 getMax 方法
		int max = getMax1(a, b);
		System.out.println("思路1最大值是：" + max);           // 方式1
		System.out.println("思路2最大值是：" + getMax2(a, b)); // 方式2

		sc.close();
	}

	// 方式1：if 语句
	private static int getMax1(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// 方式2：三元运算符
	private static int getMax2(int a, int b) {
		int max = a > b ? a : b;
		return max;
	}
}

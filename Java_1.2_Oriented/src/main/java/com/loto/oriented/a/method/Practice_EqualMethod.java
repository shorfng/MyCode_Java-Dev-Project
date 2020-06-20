package com.loto.oriented.a.method;

import java.util.Scanner;

// 代码功能：键盘输入两个整数，比较是否相等
public class Practice_EqualMethod {
	public static void main(String[] args) {
		// 键盘输入两个整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();

		// 调用比较方法
		System.out.println("方法1，两个数是否相等： " + compare1(a, b));
		System.out.println("方法2，两个数是否相等： " + compare2(a, b));
		System.out.println("方法3，两个数是否相等： " + compare3(a, b));

		sc.close();
	}

	// 思路1：if语句
	private static boolean compare1(int a, int b) {
		if (a == b) {
			return true;
		} else {
			return false;
		}
	}

	// 思路2：三元运算符
	private static boolean compare2(int a, int b) {
		return a == b ? true : false;
	}

	// 思路3：最终版
	private static boolean compare3(int a, int b) {
		return a == b;
	}
}

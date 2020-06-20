package com.loto.oriented.a.method;

import java.util.Scanner;

// 代码功能：键盘输入3个整数，获取较大值
public class Practice_MaxMethod2 {
	public static void main(String[] args) {
		// 键盘输入三个整数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个整数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个整数：");
		int b = sc.nextInt();
		System.out.println("请输入第三个整数：");
		int c = sc.nextInt();

		// 调用比较方法
		int maxNum = compare(a, b, c);
		System.out.println("三个数的最大值是：" + maxNum);

		sc.close();
	}

	// 比较方法
	private static int compare(int a, int b, int c) {
		int temp = (a > b) ? a : b;
		int max = (temp > c) ? temp : c;

		return max;
	}
}

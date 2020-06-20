package com.loto.oriented.a.method;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：a_Define.java
 * Function：方法定义
 */

public class a_Define {
	public static void main(String[] args) {
		System.out.println("====== 无返回值无参数方法 ======");
		printRect();

		System.out.println("====== 有返回值无参数方法 ======");
		int num = getNum();
		System.out.println("输入的整数是：" + num);

		System.out.println("====== 无返回值有参数方法 ======");
		printRect2(3, 4);

		System.out.println("====== 有返回值有参数方法 ======");
		double avg = getAvg(66, 99, 100);
		System.out.println("平均值是：" + avg);
	}

	// 1、定义无返回值无参数方法（打印3行，每行3个*号的矩形）
	private static void printRect() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// 2、定义有返回值无参数方法（键盘录入得到一个整数）
	private static int getNum() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

		return num;
	}

	// 3、定义无返回值有参数方法（打印指定M行，每行N个*号的矩形）
	private static void printRect2(int m, int n) {
		for (int i = 0; i < m; i++) {       // 打印M行星
			for (int j = 0; j < n; j++) {   // 每行中打印N颗星
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// 4、定义有返回值有参数方法（求三个数的平均值）
	private static double getAvg(double a, double b, double c) {
		double result = (a + b + c) / 3;

		return result;
	}
}
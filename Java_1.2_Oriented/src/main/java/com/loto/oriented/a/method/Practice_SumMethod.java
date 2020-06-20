package com.loto.oriented.a.method;

// 代码功能：方法求和 
public class Practice_SumMethod {
	public static void main(String[] args) {
		// 方法调用方式1：单独调用
		sumMethod(10, 20);

		// 方法调用方式2：输出调用
		System.out.println(sumMethod(10, 20));

		// 方法调用方式3：赋值调用
		int sum = sumMethod(10, 20);
		System.out.println("a + b = " + sum);
	}

	// 定义方法
	private static int sumMethod(int a, int b) {
		return a + b;
	}
}
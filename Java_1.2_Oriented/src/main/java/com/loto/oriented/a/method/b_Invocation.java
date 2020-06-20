package com.loto.oriented.a.method;

/**
 * Author：蓝田_Loto
 * PageName：b_Invocation.java
 * Function：方法调用
 */

public class b_Invocation {
	// 1、程序从main方法开始执行
	public static void main(String[] args) {
		// 2、调用方法
		int sum = sumMethod(10, 20);

		// 5、输出sum
		System.out.println("a + b = " + sum);
	}

	// 3、定义方法（将10赋值给a，将20赋值给b）
	private static int sumMethod(int a, int b) {
		// 4、把a+b的结果通过return返回给sum
		return a + b;
	}
}

package com.loto.oriented.a.method;

/**
 * Author：蓝田_Loto
 * PageName：c_TypeParameter_Basic.java
 * Function：参数传递 - 基本类型：形式参数的改变不影响实际参数
 */

public class c_TypeParameter_Basic {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("方法调用前：a =" + a + "," + "b =" + b);   // 10,20

		// 调用方法
		change(a, b); // 实参
		System.out.println("方法调用后：a =" + a + "," + "b =" + b);   // 10,20
	}

	private static void change(int a, int b) { // 形参
		a = b;      // 20
		b = a + b;  // 40
		System.out.println("方法调用中：a =" + a + "," + "b =" + b);   // 20,40
	}
}

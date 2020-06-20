package com.loto.grammar.d.operator;

/**
 * Author：蓝田_Loto
 * PageName：f_TernaryOperator.java
 * Function：三元运算符
 */

public class f_TernaryOperator {
	public static void main(String[] args) {
		// 定义三个int类型的变量
		int a = 10;
		int b = 30;
		int c = 20;

		// 实例1：比较两个数是否相同
		boolean flag = (a == b) ? true : false;
		System.out.println(flag);  // false

		// 实例2：比较三个整数中的最大值
		int temp = ((a > b) ? a : b); // 先比较两个整数的大值
		int max = ((temp > c) ? temp : c);
		System.out.println(max); // 30
	}
}

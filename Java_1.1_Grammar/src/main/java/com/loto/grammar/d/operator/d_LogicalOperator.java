package com.loto.grammar.d.operator;

/**
 * Author：蓝田_Loto
 * PageName：d_LogicalOperator.java
 * Function：逻辑运算符 （ && || ！）
 */

public class d_LogicalOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		// && 逻辑与、短路与：前假为假，全真为真，一假则假
		System.out.println("======== 逻辑与、短路与 ========");
		System.out.println((a > b) && (a > c)); // false && false -> false
		System.out.println((a < b) && (a > c)); // true && false -> false
		System.out.println((a > b) && (a < c)); // false && true -> false
		System.out.println((a < b) && (a < c)); // true && true -> true

		// || 逻辑或、短路或：前真为真，全假为假，一真则真
		System.out.println("======== 逻辑或、短路或 ========");
		System.out.println((a > b) || (a > c)); // false || false -> false
		System.out.println((a < b) || (a > c)); // true || false -> true
		System.out.println((a > b) || (a < c)); // false || true -> true
		System.out.println((a < b) || (a < c)); // true || true -> true

		// ！ 逻辑非：真假互换
		System.out.println("======== 逻辑非 ========");
		System.out.println((a > b));   // false -> false
		System.out.println(!(a > b));  // !false -> true
		System.out.println(!!(a > b)); // !!false -> false
	}
}
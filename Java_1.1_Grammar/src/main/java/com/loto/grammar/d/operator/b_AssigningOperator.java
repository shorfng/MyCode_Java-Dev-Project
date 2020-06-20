package com.loto.grammar.d.operator;

/**
 * Author：蓝田_Loto
 * PageName：b_AssigningOperator.java
 * Function：赋值运算符（ =  +=  -=  *=  /=  %= ）
 */

public class b_AssigningOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		// =：赋值运算符
		int c = (a = b);
		System.out.println(c); // 20

		// +=：加后赋值
		a += 10;
		System.out.println(a); // 20

		// -=：减后赋值
		a -= 10;
		System.out.println(a); // 10

		// *=：乘后赋值
		a *= 10;
		System.out.println(a); // 100

		// /=：整除后赋值
		a /= 10;
		System.out.println(a); // 10

		// %=：取模后赋值
		a %= 10;
		System.out.println(a); // 0

		// 强转后赋值
		byte d = 10;
		d += 20; // 相当于 d = (byte)(d+20);
		System.out.println(d); // 30
	}
}
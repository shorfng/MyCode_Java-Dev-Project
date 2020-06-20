package com.loto.grammar.d.operator;

/* 知识考察：算术运算符
 * 定义一个int类型的变量v1，初始值：10
 * 定义一个int类型的变量v2，初始值：3
 *
 * 请分别打印这两个数加，减，乘，除，取模的结果
 * 将v1自增1，将v2自减1
 * 再次打印这两个数：加，减，乘，除，取模的结果
 */

public class Practice01 {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 3;
		
		// 打印这两个数加，减，乘，除，取模的结果
		System.out.println( v1 + v2 );  //  10+3 = 13
		System.out.println( v1 - v2 );  //  10-3 = 7
		System.out.println( v1 * v2 );  //  10*3 = 30
		System.out.println( v1 / v2 );  //  10/3 = 3
		System.out.println( v1 % v2 );  //  10%3 = 1
		
		++v1; // 11
		--v2; // 2
		
		// 将v1自增1，将v2自减1，再次打印这两个数：加，减，乘，除，取模的结果
		System.out.println( v1 + v2 );  //  11+2 = 13
		System.out.println( v1 - v2 );  //  11-2 = 9
		System.out.println( v1 * v2 );  //  11*2 = 22
		System.out.println( v1 / v2 );  //  11/2 = 5
		System.out.println( v1 % v2 );  //  11%2 = 1
	}
}

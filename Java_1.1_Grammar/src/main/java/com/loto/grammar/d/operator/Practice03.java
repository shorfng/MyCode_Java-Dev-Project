package com.loto.grammar.d.operator;

/* 知识考察：逻辑运算符
定义一个int类型的变量v1，初始值：24
定义一个double类型的变量v2，初始值：3.14

1、请打印：v1 是否大于20，并且小于50
2、请打印：v1是否小于20，或者大于50
3、请打印：v1是否大于20，并且v2小于3.5
 */
public class Practice03 {
	public static void main(String[] args) {
		int v1 = 24;
		double v2 = 3.14;
		
		System.out.println( v1 > 20 && v1 < 50 );  // true
		System.out.println( v1 < 20 || v1 > 50 );  // false
		System.out.println( v1 > 20 && v2 < 3.5 ); // true
	}
}

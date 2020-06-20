package com.loto.grammar.d.operator;

/* 知识考察：比较运算符
定义一个int类型的变量v1，初始值：10
定义一个int类型的变量v2，初始值：3

1、请打印v1是否等于v2
2、请打印v1是否大于v2
3、请打印v1是否小于v2
4、请打印v1是否大于等于v2
5、请打印v1是否小于等于v2
6、请打印v1是否不等于v2
 */

public class Practice02 {
	public static void main(String[] args) {
		int v1 = 10;
		int v2 = 3;
		
		System.out.println( v1 == v2 );  // false
		System.out.println( v1 > v2);    // true
		System.out.println( v1 < v2);    // false
		System.out.println( v1 >= v2);   // true
		System.out.println( v1 <= v2);   // false
		System.out.println( v1 != v2);   // true
	}
}

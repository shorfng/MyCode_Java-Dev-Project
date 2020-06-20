package com.loto.oriented.k.finals.c.finalvariable;

/**
 * Author：蓝田_Loto
 * PageName：.java
 * Function：被final修饰的变量
 */

// 1、final修饰局部变量
public class Main {
	public static void main(String[] args) {
		// （1）final修饰基本类型变量：表示该变量的值不能改变，即不能用“=”重新赋值
		final int i = 1;
		System.out.println("i = " + i);

		// （2）final修饰引用类型变量：表示该变量的引用地址不能变，而不是引用地址里的内容不能变
		final Person p = new Person(100);
		System.out.println(p);
	}
}

package com.loto.api.c.string.b.member;

/**
 * Author：蓝田_Loto
 * PageName：d_trimMethod.java
 * Function：String常用成员方法 - 去除空格方法
 */

/* String trim()   去除字符串两端空格，字符串中间的空格无法去掉，返回一个新字符串 */
public class d_trimMethod {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "   hello   ";
		String s3 = "   he l   lo   ";

		System.out.println(s1.trim()); // hello
		System.out.println(s2.trim()); // hello
		System.out.println(s3.trim()); // he l lo
	}
}

package com.loto.api.c.string.a.construct;

/**
 * Author：蓝田_Loto
 * PageName：d_CreatString_char.java
 * Function：字符数组 -> 字符串
 */

public class d_CreatString_char {
	public static void main(String[] args) {
		// 1、将字符数组全部转换成字符串 -> 创建一个新的字符串
		// String(char[] value)
		char[] chs1 = { 'L', 'o', 't', 'o' };
		String s1 = new String(chs1);
		System.out.println(s1);

		System.out.println("============");

		// 2、将字符数组部分转换成字符串 -> 创建一个新的字符串
		// String(char[] value, int offset, int count)：从索引值为offset开始，持续count个
		char[] chs2 = { 'L', 'o', 't', 'o' };
		String s2 = new String(chs2, 0, 3); // 从0索引开始，持续3个
		System.out.println(s2);
	}
}

package com.loto.api.c.string.a.construct;

/**
 * Author：蓝田_Loto
 * PageName：c_CreatString_byte.java
 * Function：字节数组 -> 字符串
 */

public class c_CreatString_byte {
	public static void main(String[] args) {
		// 1、将字节数组全部转换成字符串 -> 创建一个新的字符串
		// String(byte[] bytes)
		byte[] bytes1 = { 22, 3, 24, 56 };
		String s1 = new String(bytes1);
		System.out.println(s1);

		System.out.println("=====================");

		// 2、将字节数组部分转换成字符串 -> 创建一个新的字符串
		// String(byte[] bytes, int offset, int length)：从索引值为offset开始，持续length个
		byte[] bytes2 = { 65, 66, 67, 68 };
		String s2 = new String(bytes2, 1, 2); // 从索引1开始，将前两个元素转换成字符串
		System.out.println(s2);
	}
}

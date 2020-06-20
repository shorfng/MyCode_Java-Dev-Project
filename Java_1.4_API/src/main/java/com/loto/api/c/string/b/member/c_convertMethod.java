package com.loto.api.c.string.b.member;

/**
 * Author：蓝田_Loto
 * PageName：c_convertMethod.java
 * Function：String常用成员方法 - 转换功能方法
 */

/*
1、byte[] getBytes()     将字符串转换成字节数组（byte数组相关的功能，会查询编码表）
2、char[] toCharArray()  把字符串转换为字符数组
3、String toLowerCase()  把字符串转换为小写字符串，产生一个新的字符串
4、String toUpperCase()  把字符串转换为大写字符串，产生一个新的字符串
 */
public class c_convertMethod {
	public static void main(String[] args) {
		// 创建字符串对象
		String s = "abcde";

		System.out.println("===== 1、getBytes =====");

		// 1、byte[] getBytes() 将字符串转换成字节数组（byte数组相关的功能，会查询编码表）
		byte[] bytes = s.getBytes();
		for (int i = 0; i < bytes.length; i++) {
			System.out.println(bytes[i]);
		}

		System.out.println("===== 2、toCharArray =====");

		// 2、char[] toCharArray() 把字符串转换为字符数组
		char[] chs = s.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			System.out.println(chs[i]);
		}

		System.out.println("===== 3、toLowerCase =====");

		// 3、把字符串转换为小写字符串，产生一个新的字符串
		System.out.println("HELLO".toLowerCase());

		System.out.println("===== 4、toUpperCase =====");

		// 4、把字符串转换为大写字符串，产生一个新的字符串
		System.out.println("hello".toUpperCase());
	}
}
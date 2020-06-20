package com.loto.api.c.string.a.construct;

/**
 * Author：蓝田_Loto
 * PageName：b_CreatString_Original.java
 * Function：使用new关键字创建对象（original原始创建方法）（new出来的字符串对象存放在堆中）
 */

// String(String original)
public class b_CreatString_Original {
	public static void main(String[] args) {
		String str1 = new String("CJ");
		String str2 = new String("CJ");

		System.out.println(str1.equals(str2)); // true
		System.out.println(str1 == str2);      // false
	}
}

package com.loto.api.c.string.c.use;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：c_convertPractice.java
 * Function：键盘录入一个字符串，把该字符串的首字母转成大写，其余为小写
 */

public class c_convertPractice {
	public static void main(String[] args) {
		// 键盘输入字符串
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串：");
		String s = sc.next();

		String s1 = s.substring(0, 1); // 截取首字符
		String s2 = s.substring(1);    // 截取除首字符之外的字符（从索引值为1开始截取字符串到字符串结尾）

		// 转换过后的字符
		String s3 = s1.toUpperCase() + s2.toLowerCase();
		System.out.println("转换过后的字符串为：" + s3);
		sc.close();
	}
}

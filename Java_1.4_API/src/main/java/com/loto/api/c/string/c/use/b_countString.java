package com.loto.api.c.string.c.use;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：b_countString.java
 * Function：统计字符串中大写、小写及数字字符个数
 */

public class b_countString {
	public static void main(String[] args) {
		// 键盘录入一个字符串数据
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串数据：");
		String s = sc.nextLine();

		// 定义三个统计变量，初始化值都是0
		int big = 0;
		int small = 0;
		int num = 0;

		// 遍历字符串，得到每一个字符
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 'A' && s.charAt(i) < 'Z') {
				big++;
			} else if (s.charAt(i) > 'a' && s.charAt(i) < 'z') {
				small++;
			} else if (s.charAt(i) > '0' && s.charAt(i) < '9') {
				num++;
			} else {
				System.out.println("字符" + s.charAt(i) + "非法！");
			}
		}

		System.out.println("字符串中，大写字母的个数是：" + big);
		System.out.println("字符串中，小写字母的个数是：" + small);
		System.out.println("字符串中，数字的个数是：" + num);

		sc.close();
	}
}

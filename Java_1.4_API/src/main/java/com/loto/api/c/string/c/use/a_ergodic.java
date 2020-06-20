package com.loto.api.c.string.c.use;

/**
 * Author：蓝田_Loto
 * PageName：a_ergodic.java
 * Function：字符串遍历
 */

public class a_ergodic {
	public static void main(String[] args) {
		String s = "abcde";

		// for循环遍历字符串，charAt打印字符串对应索引的字符
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
	}
}

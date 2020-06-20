package com.loto.api.c.string.c.use;

/**
 * Author：蓝田_Loto
 * PageName：d_convert_count.java
 * Function：查询大字符串中，出现指定小字符串的次数
 */

public class d_convert_count {
	public static void main(String[] args) {
		String big = "fjiojavafkeajkfjavaeiajifejavapa";
		String small = "java";

		// 方案1
		search1(big);

		// 方案2
		int num = search2(big, small);
		System.out.println(num);
	}

	private static void search1(String s) {
		String str = s.replace("*", "#"); // 把字符串中所有的*替换成#，此时字符串中没有*
		// System.out.println(str);

		str = str.replace("java", "*"); // 把字符串中所有的java替换成*，此时字符串中*的个数就是java个数
		// System.out.println(str);

		int count = 0;

		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == '*') {
				count++;
			}
		}
		System.out.println("java个数：" + count);
	}

	private static int search2(String big, String small) {
		int count = 0; // 出现小串的次数
		int index = -1;// 出现小串的位置

		while ((index = big.indexOf(small)) != -1) {
			count++;                        // 出现次数+1
			big = big.substring(index + 1); // 更改大串内容
		}
		return count;
	}
}
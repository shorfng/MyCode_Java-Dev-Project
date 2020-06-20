package com.loto.api.c.string.b.member;

/**
 * Author：蓝田_Loto
 * PageName：b_getMethod.java
 * Function：String常用成员方法 - 获取功能方法
 */

/*
1、int length()                                    获取字符串的长度(即是字符个数)
2、char charAt(int index)                          获取指定索引处的字符(索引从0开始计算)
3、int indexOf(String str)                         获取字符串str在字符串对象中第一次出现的索引，没有返回-1
4、int indexOf(char ch)                            获取字符ch在字符串对象中第一次出现的索引，没有返回-1
5、String substring(int beginIndex)                从索引值为beginIndex开始截取字符串到字符串结尾
6、String substring(int beginIndex, int endIndex)  从索引值为beginIndex开始，到endIndex-1结束截取字符串
*/

public class b_getMethod {
	public static void main(String[] args) {
		String s = "hello";

		System.out.println("===== 1、length =====");

		// 1、获取字符串的长度(即是字符个数)
		System.out.println(s.length()); // 5

		System.out.println("===== 2、charAt =====");

		// 2、获取指定索引处的字符(索引从0开始计算)
		System.out.println(s.charAt(3)); // l

		System.out.println("===== 3、indexOf =====");

		// 3、获取str在字符串对象中第一次出现的索引,没有返回-1
		System.out.println(s.indexOf("o")); // 4
		System.out.println(s.indexOf("a")); // -1
		System.out.println(s.indexOf("llo")); // 2

		System.out.println("===== 4、indexOf =====");

		// 4、获取字符ch在字符串对象中第一次出现的索引，没有返回-1
		int index = s.indexOf('h');
		System.out.println(index);

		System.out.println("===== 5、substring =====");

		// 5、从索引值为beginIndex开始截取字符串到字符串结尾
		System.out.println(s.substring(1)); // ello

		System.out.println("===== 6、substring =====");

		// 6、从索引值为beginIndex开始，到endIndex-1结束截取字符串
		System.out.println(s.substring(1, 3)); // el
	}
}
package com.loto.api.c.string.b.member;

/**
 * Author：蓝田_Loto
 * PageName：a_judgeMethod.java
 * Function：String常用成员方法 - 判断功能方法
 */

/*
1、boolean equals(Object obj)            比较字符串的内容是否相同,跟哪个字符串比较，参数就写哪个字符串
2、boolean equalsIgnoreCase(String str)  比较字符串的内容是否相同,比较时忽略大小写
3、boolean startsWith(String str)        判断字符串对象是否以指定的str开头
4、boolean endsWith(String str)          判断字符串对象是否以指定的str结尾
5、[boolean] contains(String s)          判断一个字符串，是否包含另一个字符串str，只要有str，不论几个都会返回true，否则false
*/

public class a_judgeMethod {
	public static void main(String[] args) {
		String s1 = new String("hello");
		String s2 = "hello";
		String s3 = "Hello";

		// 比较地址编号
		System.out.println("===== 0、== =====");
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // false
		System.out.println(s2 == s3); // false
		
		// 1、比较字符串的内容是否相同，跟哪个字符串比较，参数就写哪个字符串
		System.out.println("===== 1、equals判断地址和内容 =====");
		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s3)); // false

		// 2、比较字符串的内容是否相同,比较时忽略大小写
		System.out.println("===== 2、equalSIgnoreCase =====");
		System.out.println(s2.equalsIgnoreCase(s3)); // true

		// 3、判断字符串对象是否以指定的str开头
		System.out.println("===== 3、startsWith =====");
		String s4 = "nihao";
		System.out.println(s4.startsWith("ni")); // true
		System.out.println("nihao".startsWith("ni")); // true
		System.out.println("nihao".startsWith("nihao")); // true
		System.out.println("nihao".startsWith("nii")); // false

		// 4、判断字符串对象是否以指定的str结尾
		System.out.println("===== 4、endsWith =====");
		System.out.println(s4.endsWith("hao")); // true
		System.out.println("nihao".endsWith("hao")); // true
		System.out.println("nihao".endsWith("nihao")); // true
		System.out.println("nihao".endsWith("nii"));// false

		// 5、判断一个字符串，是否包含另一个字符串
		System.out.println("===== 5、contains =====");
		String s6 = "abcdef";
		String s7 = "cdef";
		String s8 = "cdefg";
		System.out.println(s6.contains(s7)); // true
		System.out.println(s7.contains(s8)); // false
		System.out.println(s6.contains(s8)); // false
		System.out.println(s6.contains("a"));// true
	}
}

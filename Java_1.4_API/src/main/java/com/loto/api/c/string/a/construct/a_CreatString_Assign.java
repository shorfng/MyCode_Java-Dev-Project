package com.loto.api.c.string.a.construct;

/**
 * Author：蓝田_Loto
 * PageName：a_CreatString_Assign.java
 * Function：使用字面值常量创建字符串（创建的字符串一旦生成，在常量池中不可变，共享同一片内存区域，以后再创建相同的内容也只有一份）
 */

public class a_CreatString_Assign {
	public static void main(String[] args) {
		String str1 = "TD";
		String str2 = "TD";
		System.out.println(str1 == str2);      // true（str1的引用和str2的引用指向的同一片内存区域）
		System.out.println(str1.equals(str2)); // true
		System.out.println("hashcode：" + str1.hashCode());  // hashcode：2672

		// 内存中重新开辟一块区域（通过hashcode不同来证明）
		str1 = "CJ";
		System.out.println(str1);                           // CJ
		System.out.println("hashcode：" + str1.hashCode()); // hashcode：2151
	}
}

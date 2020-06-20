package com.loto.grammar.f.array.one.array;

/*
按以下要求编写代码：
（1）定义一个数组，存储以下信息：
     java  oracle  php  mysql  HTML  android  IOS  JSP 
（2）打印数组中所有偶数索引位置上的值；
 */
public class Practice_Value {
	public static void main(String[] args) {
		String[] arr = { "java", "oracle", "php ", " mysql", "HTML", "android", "IOS", "JSP" };

		System.out.println("所有偶数索引位置上的值：");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
}

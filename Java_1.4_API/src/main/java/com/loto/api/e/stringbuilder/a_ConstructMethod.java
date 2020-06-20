package com.loto.api.e.stringbuilder;

/**
 * Author：蓝田_Loto
 * PageName：a_ConstructMethod.java
 * Function：StringBuilder_构造方法
 */

/*
 1、StringBuilder()               构造一个没有字符的字符串构建器，初始容量为16个字符
 2、StringBuilder(String str)     构造一个初始化为指定字符串内容的字符串构建器
 */

public class a_ConstructMethod {
	public static void main(String[] args) {
		// 1、创建一个空的sb容器
		StringBuilder sb1 = new StringBuilder();
		System.out.println("sb1 = " + sb1);    // sb1 =

		// 2、创建一个非空的sb容器
		StringBuilder sb2 = new StringBuilder("abc");
		System.out.println("sb2 = " + sb2);   // sb2 = abc
	}
}
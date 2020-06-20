package com.loto.api.f.scanner;

import java.util.Scanner;

/**
 * Author：蓝田_Loto
 * PageName：d_Practice.java
 * Function：输入、打印
 */

public class d_Practice {
	public static void main(String[] args) {
	    // 实例化Scanner对象
		Scanner sc = new Scanner(System.in);

		System.out.println("请输入你的姓名：");
		String name = sc.next();

		System.out.println("请输入你的年龄：");
		int age = sc.nextInt();

		System.out.println("请输入你的身高：");
		double height = sc.nextDouble();
		
		System.out.println("姓名：" + name);
		System.out.println("年龄：" + age);
		System.out.println("身高：" + height);	
		
		// 关闭流
		sc.close();
	}
}

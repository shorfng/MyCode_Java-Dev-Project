package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;
import java.util.Scanner;

/*
定义一个集合，只能存储String 类型的数据，然后创建一个键盘录入的Scanner对象，
要求该集合可以一直循环录入数据，直到在控制台录入字符串 exit，跳出循环结束键盘录入
 */
public class i_practice9 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("输入字符串：");
			String s = sc.next();

			if (s.equals("exit")) {
				break;
			}
			list.add(s);
		}
		System.out.println(list);
		sc.close();
	}
}

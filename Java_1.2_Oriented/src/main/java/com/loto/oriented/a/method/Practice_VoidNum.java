package com.loto.oriented.a.method;

// 【void用法】定义一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值
public class Practice_VoidNum {
	public static void main(String[] args) {
		printNum(10);
	}

	// void类型的方法，不能通过打印语句进行打印
	private static void printNum(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(i);
		}
	}
}

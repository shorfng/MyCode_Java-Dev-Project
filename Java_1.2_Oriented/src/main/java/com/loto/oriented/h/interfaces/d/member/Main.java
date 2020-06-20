package com.loto.oriented.h.interfaces.d.member;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：接口中的成员
 */

public class Main {
	public static void main(String[] args) {
		// 调用接口中的成员变量
		System.out.println(MyInterface.i); // 1
		System.out.println(MyInterface.j); // 2
		System.out.println(MyInterface.k); // 3

		// 创建接口的实现类对象
		MyImplement my = new MyImplement();

		// 调用接口中的成员方法
		my.show1();
		my.show2();
		my.show3();
		my.show4();
	}
}

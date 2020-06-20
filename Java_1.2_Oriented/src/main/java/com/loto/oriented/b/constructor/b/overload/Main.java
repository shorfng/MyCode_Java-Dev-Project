package com.loto.oriented.b.constructor.b.overload;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：构造器的重载
 */

public class Main {
	public static void main(String[] args) {
		// 调用空参数的构造方法，创建对象
		Person p1 = new Person();
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		System.out.println("=================");

		// 调用两个参数的构造方法，创建对象
		Person p2 = new Person("TD", 11);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}
}

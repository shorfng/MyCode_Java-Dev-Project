package com.loto.oriented.e.encapsulation.c.this2;

/**
 * Author：蓝田_Loto
 * PageName：.java
 * Function：this使用场景：解决构造器重载时的互相调用问题
 */

public class Main {
	public static void main(String[] args) {
		// 调用无参构造方法
		Person p1 = new Person();
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

		// 调用有参构造方法
		Person p2 = new Person("CJ", 9);
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
	}
}

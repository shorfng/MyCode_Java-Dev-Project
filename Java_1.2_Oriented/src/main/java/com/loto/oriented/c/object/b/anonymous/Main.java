package com.loto.oriented.c.object.b.anonymous;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：匿名对象
 */

public class Main {
	public static void main(String[] args) {
		// 1、创建一个匿名对象，调用eat方法
		new Person().eat();

		System.out.println("==================");

		// 用法1：把匿名对象作为方法的实参传递
		Person p1 = new Person();
		method1(p1);           // 使用p对象
		method1(new Person()); // 使用匿名对象

		System.out.println("==================");

		// 用法2：匿名对象作为方法返回值
		Person p2 = method2();
		p2.eat();
	}

	private static void method1(Person p) {
		p.eat();
	}

	private static Person method2() {
		// 普通方式
		// Person p = new Person();
		// return p;

		// 返回的是这个类的对象
		return new Person();
	}
}

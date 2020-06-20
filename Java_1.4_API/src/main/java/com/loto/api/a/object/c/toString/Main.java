package com.loto.api.a.object.c.toString;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：object类的toString()方法
 */

public class Main {
	public static void main(String[] args) {
		// Object类的toString方法返回的为对象地址值，即对象的类型+@+哈希值(地址值)
		Object obj = new Object();
		System.out.println(obj);             // java.lang.Object@66d3c617
		System.out.println(obj.toString());  // java.lang.Object@66d3c617

		// 自定义类Person重写了toString方法，返回对象的具体信息
		Person p = new Person("TD", 20);
		System.out.println(p);              // name:TD，age:20
		System.out.println(p.toString());   // name:TD，age:20
	}
}

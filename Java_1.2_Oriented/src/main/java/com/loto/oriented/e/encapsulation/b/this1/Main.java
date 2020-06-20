package com.loto.oriented.e.encapsulation.b.this1;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：this使用场景
 *          1、解决成员变量和局部变量（参数）之间的重名问题
 *          2、同类中实例方法之间的互相调用问题
 */

public class Main {
	public static void main(String[] args) {
		System.out.println("this使用场景1：解决成员变量和局部变量（参数）之间的重名问题");

		// 创建 p 对象
		Person p = new Person();
		p.setName("TD");
		p.setAge(12);
		p.introduce();

		// 创建 q 对象
		Person q = p; // p和q地址相同

		// 创建 r 对象
		Person r = new Person();
		r.setName("CJ");
		r.setAge(11);
		r.introduce();

		System.out.println(p);
		System.out.println(q);
		System.out.println(r);

		System.out.println("=======================================");
		System.out.println("this使用场景2：同类中实例方法之间的互相调用问题");
		p.say();
	}
}

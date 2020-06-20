package com.loto.oriented.e.encapsulation.d.finalcode;

public class Main {
	public static void main(String[] args) {
		// 无参的构造方法
		PersonClass p1 = new PersonClass();
		p1.setName("TD");
		p1.setAge(13);
		System.out.println("name=" + p1.getName());
		System.out.println("age =" + p1.getAge());

		// 有两个参数的构造方法
		PersonClass p2 = new PersonClass("CJ", 12);
		System.out.println("name=" + p2.getName());
		System.out.println("age =" + p2.getAge());
	}
}

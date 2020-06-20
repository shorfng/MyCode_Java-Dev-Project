package com.loto.oriented.j.statics;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：static关键字
 */

public class Main {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name); // 没有被static修饰，值为null

		p1.name = "TD";
		p1.SEX = "男";

		System.out.println(p1.name); // TD
		System.out.println(p1.SEX);  // 男

		System.out.println("=====================");
		Person p2 = new Person();

		System.out.println(p2.SEX);     // 没有给p2的SEX赋值，但由于是static修饰的，此时值为“男”
		System.out.println(Person.SEX); // 被static修饰的成员，可以被 类名.成员变量 直接调用
	}
}
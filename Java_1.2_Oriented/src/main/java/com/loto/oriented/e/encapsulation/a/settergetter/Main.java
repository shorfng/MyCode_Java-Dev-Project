package com.loto.oriented.e.encapsulation.a.settergetter;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：封装 - setter和getter用法
 */

public class Main {
	public static void main(String[] args) {
		// 创建对象
		Person p = new Person();

		// 给成员变量赋值 -> setter
		p.setName("TD");
		p.setAge(13);

		// 获取成员变量的值 -> getter
		System.out.println("name =" + p.getName());
		System.out.println("age = " + p.getAge());

		// 调用成员方法
		p.introduce();
	}
}

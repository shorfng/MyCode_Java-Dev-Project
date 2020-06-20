package com.loto.oriented.b.constructor.b.overload;

public class Person {
	// 成员变量
	private String name;
	private int age;

	// setter和getter方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 以下两个构造方法是重载
	// 空参数的构造方法
	public Person() {

	}

	// 带有两个参数的构造方法
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

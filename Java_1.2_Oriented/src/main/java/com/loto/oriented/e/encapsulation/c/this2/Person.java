package com.loto.oriented.e.encapsulation.c.this2;

public class Person {
	private String name;
	private int age;

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

	public Person() {
		// 调用了有参构造方法（必须写在方法内部的第一行）
		this("TD", 11);
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}

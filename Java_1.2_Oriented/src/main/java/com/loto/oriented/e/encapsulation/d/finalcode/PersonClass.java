package com.loto.oriented.e.encapsulation.d.finalcode;

public class PersonClass {
	private String name;
	private int age;

	public void setAge(int age) {
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public PersonClass() {
		System.out.println("无参的构造方法");
	}

	public PersonClass(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("有两个参数的构造方法");
	}
}

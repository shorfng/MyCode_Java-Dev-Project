package com.loto.oriented.f.inheritance.e.superconstructor;

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
		System.out.println("调用了父类的无参构造器");
	}

	public Person(String name, int age) {
		System.out.println("调用了父类的有参构造器");
		this.name = name;
		this.age = age;
	}
}

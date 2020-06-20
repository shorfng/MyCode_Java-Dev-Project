package com.loto.api.a.object.c.toString;

public class Person extends Object {
	private String name;
	private int age;

	public Person() {
		super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// Person类重写了Object类的 toString()方法，返回对象的成员变量的值（因为默认返回的是内存地址，没有意义）
	@Override
	public String toString() {
		return "name:" + name + "，age:" + age;
	}

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
}

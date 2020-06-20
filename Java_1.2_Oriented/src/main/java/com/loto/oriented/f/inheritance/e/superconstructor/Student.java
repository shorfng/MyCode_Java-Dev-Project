package com.loto.oriented.f.inheritance.e.superconstructor;

public class Student extends Person {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Student() {
		super();
		System.out.println("调用了子类的无参构造器");

	}

	public Student(String name, int age, String sex) {
		super(name, age); // 如果不调用super，则姓名和年龄为空
		this.sex = sex;
		System.out.println("调用了子类的有参构造器");
	}
}

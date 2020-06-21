package com.loto.collections.a1.arraylist.b.practice;

public class Person {
	private String name;  // 姓名
	private String sex;   // 性别
	private int age;      // 年龄
	private String id;    // 身份证号
	private int height;   // 身高
	private int weigh;    // 体重

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeigh() {
		return weigh;
	}

	public void setWeigh(int weigh) {
		this.weigh = weigh;
	}

	public Person(String name, String sex, int age, String id, int height, int weigh) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.id = id;
		this.height = height;
		this.weigh = weigh;
	}

	public Person() {

	}
}

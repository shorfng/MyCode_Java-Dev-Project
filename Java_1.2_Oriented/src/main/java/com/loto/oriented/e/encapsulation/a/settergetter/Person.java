package com.loto.oriented.e.encapsulation.a.settergetter;

public class Person {
	// 使用private关键字私有化成员变量
	private String name;
	private int age;

	// name的set方法
	public void setName(String n) {
		// 把调用者传递过来的n参数的值赋值给name字段
		name = n;
	}

	// name的get方法
	public String getName() {
		// 返回字段name的值
		return name;
	}

	// age的set方法
	public void setAge(int a) {
		if (a < 0 || a > 130) {
			System.out.println("输入的年龄不符合");
		} else {
			age = a;
		}
	}

	// age的get方法
	public int getAge() {
		return age;
	}

	// 自我介绍的方法
	public void introduce() {
		System.out.println("我叫" + name + ",今年" + age + "岁了");
	}
}

package com.loto.oriented.k.finals.c.finalvariable;

// 2、final修饰成员变量（需要在创建对象前赋值，否则报错）
public class Person {
	// (1)成员变量赋值：定义的时候直接赋值
	// final int age = 10;

	// (2)成员变量赋值：采用构造方法赋值
	final int age;

	public Person(int age) {
		this.age = age;
	}

	// (3)setXXX方法，属于创建对象之后赋值，因此不能为final修饰的成员变量赋值
}

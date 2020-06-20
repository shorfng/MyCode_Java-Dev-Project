package com.loto.oriented.f.inheritance.d.super2;

// 子类
public class Student extends Person {
	public Student() {
		super(1); // 子类中所用的构造方法，无论重载多少个，第一行必须是super()
	}

	// 如果父类有多个构造方法，子类任意调用一个就可以
	public Student(String s) {
		// super(1);
		super("TD");
	}
}

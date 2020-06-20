package com.loto.oriented.f.inheritance.b.override;

/**
 * Author：蓝田_Loto
 * PageName：Student.java
 * Function：子类 Student
 */

public class Student extends Person {
	String id; // 学号

	// 方法覆盖（重写）
	@Override // 判断当前子类的方法是否重写了父类方法
	public void run() {
		System.out.println("子类重写父类的run方法");
	}

	public void sleep() {
		super.sleep(); // 父类原有的功能
		System.out.println("子类在父类的sleep方法基础上新增的功能");
	}
}

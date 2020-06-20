package com.loto.oriented.f.inheritance.c.super1;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：super在方法中的使用（在子类方法中，使用super调用父类被覆盖的方法）
 */

public class Main {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.say();
	}
}

// 调用顺序
// 调用了子类的say方法
// 调用了父类的run方法
// 调用了子类重写父类的run方法

package com.loto.oriented.f.inheritance.b.override;

public class Main {

	public static void main(String[] args) {
		Student stu = new Student();
		stu.run();   // 子类重写父类的run方法，只有新功能
		stu.sleep(); // 子类重写父类的sleep方法，在原有功能上添加功能
	}
}

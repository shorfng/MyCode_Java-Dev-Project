package com.loto.oriented.f.inheritance.c.super1;

// 子类
public class Student extends Person {
	public void run() {
		System.out.println("调用了子类重写父类的run方法");
	}

	public void say() {
		System.out.println("调用了子类的say方法");
		super.run();  // 调用的是父类的run方法
		run();        // 相当于 this.run()，调用的是子类的run方法
	}
}
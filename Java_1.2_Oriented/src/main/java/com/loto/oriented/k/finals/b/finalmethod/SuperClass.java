package com.loto.oriented.k.finals.b.finalmethod;

// 父类
public class SuperClass {
	// 被final修饰的方法
	public final void show() {
		System.out.println("父类的show方法（最终方法）");
	}

	public void method() {
		System.out.println("父类的method方法（一般方法）");
	}
}

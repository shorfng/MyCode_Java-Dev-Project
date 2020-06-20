package com.loto.oriented.k.finals.b.finalmethod;

// 子类
public class SubClass extends SuperClass {
	// 父类方法是final的，不可以被重写
	// public void show() {
	//
	// }

	public void method() {
		System.out.println("子类的method方法");
	}
}

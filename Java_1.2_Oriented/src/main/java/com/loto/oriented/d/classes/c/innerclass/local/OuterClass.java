package com.loto.oriented.d.classes.c.innerclass.local;

// 外部类
public class OuterClass {
	// 方法
	public void outerMehod() {
		// 局部内部类
		class InnerClass {
			// 局部内部类的方法
			public void innerMethod() {
				System.out.println("调用局部内部类的方法");
			}
		}

		// 调用局部内部类的方法
		InnerClass in = new InnerClass();
		in.innerMethod();
	}
}

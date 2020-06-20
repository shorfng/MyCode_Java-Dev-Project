package com.loto.oriented.d.classes.b.innerclass.member;

// 外部类
public class OuterClass {
	int i = 1;

	// 内部类（定义位置：在外部类中的成员位置）
	class InnerClass {
		int i = 2;

		// 内部类方法
		public void innerMethod() {
			System.out.println("调用了内部类的方法");

			// 同名变量的调用
			int i = 3;
			System.out.println(i); // 3
			System.out.println(this.i); // 2
			System.out.println(OuterClass.this.i); // 1
		}
	}
}

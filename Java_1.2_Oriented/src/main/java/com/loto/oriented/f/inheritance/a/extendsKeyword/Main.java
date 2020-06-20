package com.loto.oriented.f.inheritance.a.extendsKeyword;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：继承 extends
 */

public class Main {
	public static void main(String[] args) {
		// 创建子类对象
		Student stu = new Student();

		// 子类特有
		System.out.println("====== 子类特有 ======");
		System.out.println(stu.id);     // null
		stu.study();                    // 调用了子类特有的学习方法!

		// 子类从父类继承过来的成员变量
		System.out.println("====== 从父类继承 ======");
		System.out.println(stu.name);   // null
		System.out.println(stu.age);    // 0
		System.out.println(stu.sex);    // null
		// System.out.println(stu.num); // 无法访问

		// 子类从父类继承过来的成员方法
		stu.sleep();                    // 调用了父类的sleep成员方法！
	}
}

package com.loto.pattern.a.principle.b.DIP;

/**
 * Author：蓝田_Loto
 * Date：2020-06-03 15:32
 * PageName：DIPTest.java
 * Function：依赖倒置原则测试类
 */

public class DIPTest {
	public static void main(String[] args) {
		// 传统写法
		System.out.println("======== 传统写法 ======== ");
		Student td1 = new Student();
		td1.studyJavaCourse();
		td1.studyPythonCourse();

		// 实现依赖倒置原则：依赖注入的方式
		System.out.println("======== 实现依赖倒置原则：依赖注入的方式 ======== ");
		Student td2 = new Student();
		td2.study(new JavaCourse());
		td2.study(new PythonCourse());

		// 实现依赖倒置原则：构造方法的注入方式
		//System.out.println("======== 实现依赖倒置原则：构造方法的注入方式 ======== ");
		//Student td3 = new Student(new JavaCourse());
		//td3.study();
		//
		//Student td4 = new Student(new PythonCourse());
		//td4.study();

		System.out.println("======== 实现依赖倒置原则：单例下，setter方式注入 ======== ");
		Student td5 = new Student();
		td5.setiCourse(new JavaCourse());
		td5.study();

		td5.setiCourse(new PythonCourse());
		td5.study();
	}
}

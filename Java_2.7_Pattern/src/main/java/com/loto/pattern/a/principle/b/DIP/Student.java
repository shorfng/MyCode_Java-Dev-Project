package com.loto.pattern.a.principle.b.DIP;

/**
 * Author：蓝田_Loto
 * Date：2019-07-08 17:18
 * PageName：Student.java
 * Function：学生类
 */

public class Student {
	public Student() {
	}

	// 传统写法
	public void studyJavaCourse() {
		System.out.println("TD 在学习 Java 的课程");
	}

	public void studyPythonCourse() {
		System.out.println("TD 在学习 Python 的课程");
	}

	// 实现依赖倒置原则：依赖注入的方式
	public void study(ICourse course) {
		course.study();
	}

	// 实现依赖倒置原则：构造方法的注入方式
	//private ICourse iCourse;
	//
	//public Student(ICourse iCourse) {
	//	this.iCourse = iCourse;
	//}
	//
	//public void study(){
	//	iCourse.study();
	//}

	// 实现依赖倒置原则：单例下，setter方式注入
	private ICourse iCourse;

	public void setiCourse(ICourse iCourse) {
		this.iCourse = iCourse;
	}

	public void study(){
		iCourse.study();
	}

}

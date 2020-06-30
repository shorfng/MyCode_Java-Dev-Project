package com.loto.pattern.a.principle.b.DIP;

/**
 * Author：蓝田_Loto
 * Date：2020-06-03 15:45
 * PageName：JavaCourse.java
 * Function：Java课程类
 */

public class JavaCourse implements ICourse {

	@Override
	public void study() {
		System.out.println("TD 在学习 Java 的课程");
	}
}

package com.loto.pattern.a.principle.b.DIP;

/**
 * Author：蓝田_Loto
 * Date：2020-06-03 15:47
 * PageName：PythonCourse.java
 * Function：Python课程类
 */

public class PythonCourse implements ICourse {

	@Override
	public void study() {
		System.out.println("TD 在学习 Python 的课程");
	}
}

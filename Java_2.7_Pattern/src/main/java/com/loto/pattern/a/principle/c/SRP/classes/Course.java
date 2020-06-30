package com.loto.pattern.a.principle.c.SRP.classes;

/**
 * Author：蓝田_Loto
 * Date：2020-06-04 13:35
 * PageName：Course.java
 * Function：课程类
 */

public class Course {
	public void study(String courseName) {
		if ("直播课".equals(courseName)) {
			System.out.println("不能快进");
		} else {
			System.out.println("可以任意的来回播放");
		}
	}
}

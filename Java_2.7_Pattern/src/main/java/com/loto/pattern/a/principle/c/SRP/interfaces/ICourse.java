package com.loto.pattern.a.principle.c.SRP.interfaces;

/**
 * Author：蓝田_Loto
 * Date：2020-06-04 13:43
 * PageName：ICourse.java
 * Function：课程接口
 */

public interface ICourse {
	// 展示职责
	String getCourseName();  // 获取课程名
	byte[] getCourseVideo(); // 获取课程的视频

	// 权限职责
	void studyCourse();   // 学习课程的权限
	void refundCourse();  // 退费课程的权限
}

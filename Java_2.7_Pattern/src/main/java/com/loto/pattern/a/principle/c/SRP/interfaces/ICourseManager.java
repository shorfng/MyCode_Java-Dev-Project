package com.loto.pattern.a.principle.c.SRP.interfaces;

/**
 * Author：蓝田_Loto
 * Date：2020-06-04 13:47
 * PageName：ICourseManager.java
 * Function：课程的权限（接口层面的单一职责原则）
 */

public interface ICourseManager {
	// 权限职责
	void studyCourse();   // 学习课程的权限
	void refundCourse();  // 退费课程的权限
}

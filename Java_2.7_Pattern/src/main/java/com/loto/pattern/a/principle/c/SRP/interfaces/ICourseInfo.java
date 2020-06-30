package com.loto.pattern.a.principle.c.SRP.interfaces;

/**
 * Author：蓝田_Loto
 * Date：2020-06-04 13:47
 * PageName：ICourseInfo.java
 * Function：课程的展示（接口层面的单一职责原则）
 */

public interface ICourseInfo {
	// 展示职责
	String getCourseName();  // 获取课程名
	byte[] getCourseVideo(); // 获取课程的视频
}

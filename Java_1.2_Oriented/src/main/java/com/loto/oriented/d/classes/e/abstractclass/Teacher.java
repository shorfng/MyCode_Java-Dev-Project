package com.loto.oriented.d.classes.e.abstractclass;

/**
 * Author：蓝田_Loto
 * PageName：Teacher.java
 * Function：讲师 - 继承员工类
 */

public class Teacher extends Employee {
	// 继承后重写方法
	public void work() {
		System.out.println("讲师正在讲解Java");
	}

}

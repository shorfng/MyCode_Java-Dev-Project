package com.loto.oriented.d.classes.e.abstractclass;

/**
 * Author：蓝田_Loto
 * PageName：Manager.java
 * Function：班主任 - 继承员工类
 */

public class Manager extends Employee {
	// 继承后重写方法
	public void work() {
		System.out.println("班主任正在管理班级");
	}
}

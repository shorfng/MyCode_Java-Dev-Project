package com.loto.oriented.d.classes.e.abstractclass;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：抽象类
 */

public class Main {
	public static void main(String[] args) {
		// 助教
		Assistant ass = new Assistant();
		ass.work();

		// 班主任
		Manager man = new Manager();
		man.work();

		// 讲师
		Teacher teacher = new Teacher();
		teacher.work();
	}
}

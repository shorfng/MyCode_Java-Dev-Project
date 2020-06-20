package com.loto.oriented.g.polymorphism.a.normalclass;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：普通类的多态（定义和调用）
 */

public class Main {
	public static void main(String[] args) {
		SuperClass sup = new SubClass();
		sup.show();
	}
}

// 运行结果：
// 子类重写父类的show方法
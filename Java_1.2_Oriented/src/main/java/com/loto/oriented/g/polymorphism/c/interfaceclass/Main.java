package com.loto.oriented.g.polymorphism.c.interfaceclass;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：接口的多态（定义和调用）
 */

public class Main {
	public static void main(String[] args) {
		Myinterface my = new Myimplement();
		my.show();
	}
}

// 运行结果：
// 重写接口中的抽象方法
package com.loto.oriented.g.polymorphism.b.abstractclass;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：抽象类的多态（定义和调用）
 */

public class Main {
	public static void main(String[] args) {
		Animal_abstract ani = new Cat();
		ani.eat();
	}
}

// 运行结果：
// 猫吃老鼠（重写抽象方法）
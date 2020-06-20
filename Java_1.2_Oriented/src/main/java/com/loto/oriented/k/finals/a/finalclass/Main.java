package com.loto.oriented.k.finals.a.finalclass;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：被final修饰的类（表示最终的类，该类不能再有子类(不能被继承)，但可以有父类）
 */

public class Main {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.show();
	}
}

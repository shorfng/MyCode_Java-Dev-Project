package com.loto.oriented.k.finals.b.finalmethod;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：被final修饰的方法（表示最终的方法，该方法不能被子类重写，但可以被子类继承调用）
 */

public class Main {
	public static void main(String[] args) {
		SubClass sub = new SubClass();
		sub.show();
		sub.method();
	}
}

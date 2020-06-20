package com.loto.oriented.d.classes.d.innerclass.anonymous;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：匿名内部类（属于局部内部类）（是创建某个类型子类对象的快捷方式）
 */

public class Main {
	public static void main(String[] args) {
		// 定义实现类
		MyInterface my = new MyInterface() {
			// 重写抽象方法
			@Override
			public void myinterface() {
				System.out.println("重写抽象方法");
			}
		};

		// 方法调用
		my.myinterface();
	}
}

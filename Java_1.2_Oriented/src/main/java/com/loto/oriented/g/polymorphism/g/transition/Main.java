package com.loto.oriented.g.polymorphism.g.transition;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：多态的转型
 */

public class Main {
	public static void main(String[] args) {
		// 两个子类，使用两次多态调用
		Animal cat = new Cat();
		Animal dog = new Dog();

		// 1、类型向上转型 （cat、dog调用子类父类共有方法）
		System.out.println("====== 向上转型 ======");
		cat.eat();
		dog.eat();

		// 2、类型向下转型 （强制转换，调用子类的特有）
		System.out.println("====== 向下转型 ======");
		// instanceof判断（防止发生异常）
		if (cat instanceof Cat) {
			Cat c = (Cat) cat; // cat属于Cat对象,转成Cat类
			c.catchMouse();
		}

		if (dog instanceof Dog) {
			Dog d = (Dog) dog; // dog属于Dog对象,转成Dog
			d.lookHome();
		}
	}
}

package com.loto.oriented.g.polymorphism.d.usage;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：多态
 */

public class Main {
	public static void main(String[] args) {
		// 对象an1的两种类型 ( 编译类型Animal 运行类型cat )
		Animal an1 = new Dog();
		an1.eat(); // 狗吃骨头

		// 对象an2的两种类型 ( 编译类型Animal 运行类型cat )
		Animal an2 = new Cat();
		an2.eat(); // 猫吃鱼

		System.out.println("结论：同一个父类的方法会被不同的子类重写，在调用方法时，调用的为各个子类重写后的方法");
		System.out.println("====================");

		// 创建一个人对象
		Person p = new Person();

		// 创建一个狗对象，并调用人喂狗的方法
		Dog dog = new Dog();
		p.feed(dog); // 人喂...狗吃骨头

		// 创建一个猫对象，并调用人喂猫的方法
		Cat cat = new Cat();
		p.feed(cat); // 人喂...猫吃鱼
	}
}

package com.loto.oriented.g.polymorphism.f.instanceofsymbol;

public class Main {
	public static void main(String[] args) {
		// 创建一个人对象
		Person p = new Person();

		// 创建一个狗对象
		Dog dog = new Dog();
		p.function(dog); // 狗看家

		// 创建一个猫对象
		Cat cat = new Cat();
		p.function(cat); // 猫捉老鼠
	}
}

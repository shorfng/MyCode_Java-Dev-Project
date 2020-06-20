package com.loto.oriented.g.polymorphism.b.abstractclass;

// 抽象类子类
public class Cat extends Animal_abstract {
	@Override
	public void eat() {
		System.out.println("猫吃老鼠（重写抽象方法）");
	}
}

package com.loto.oriented.g.polymorphism.f.instanceofsymbol;

public class Dog extends Animal {
	Cat cat = new Cat();

	public void Watch() {
		System.out.println("狗看家");
	}
}

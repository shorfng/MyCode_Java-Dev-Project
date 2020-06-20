package com.loto.oriented.g.polymorphism.d.usage;

public class Person {
	public void feed(Animal ani) { // 传递进来的是Animal类型的
		System.out.print("人喂...");
		ani.eat(); // 参数 ani 是外界传递进来的一个动物对象
	}
}

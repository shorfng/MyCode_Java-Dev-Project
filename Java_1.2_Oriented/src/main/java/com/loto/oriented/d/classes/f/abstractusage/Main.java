package com.loto.oriented.d.classes.f.abstractusage;

public class Main {
	public static void main(String[] args) {
		// 调用function方法，只能传递子类对象
		Cat c = new Cat();
		function(c);

		// 抽象类作为方法的返回值
		GetAnimal g = new GetAnimal();
		Animal ani = g.show();
		ani.eat();
	}

	// 方法的参数是一个抽象类，调用方法只能传递父类的子类对象
	public static void function(Animal ani) {
		// 引用变量ani，调用方法eat
		ani.eat();
	}
}

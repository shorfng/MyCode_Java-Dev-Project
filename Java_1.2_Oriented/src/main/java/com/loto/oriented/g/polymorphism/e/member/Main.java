package com.loto.oriented.g.polymorphism.e.member;

public class Main {
	public static void main(String[] args) {
		// 编译类型            运行类型  
		SuperClass sup = new SubClass();

		System.out.println(sup.str);  // 父类字段（编译时期就已经决定调用的是父类字段）
		sup.Method();                 // 调用子类方法（子类重写父类方法）
	}
}

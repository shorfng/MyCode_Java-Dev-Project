package com.loto.oriented.f.inheritance.a.extendsKeyword;

/**
 * Author：蓝田_Loto
 * PageName：Person.java
 * Function：父类
 */

public class Person {
	// 成员变量（字段）
	public String name;  // 如果父类中的成员使用public修饰，子类可以继承该成员
	protected int age;   // 如果父类中的成员使用protected修饰，子类可以继承该成员，即使父类和子类不在同一个包中
	private int num;     // 如果父类中的成员使用private修饰，子类不可以继承该成员（因此private只能在本类中访问）
	String sex;          // 如果父类和子类在同一个包中，此时子类可以继承父类中缺省修饰符的成员

	// 成员方法
	public void sleep() {
		System.out.println("调用了父类的sleep成员方法！");
	}
}

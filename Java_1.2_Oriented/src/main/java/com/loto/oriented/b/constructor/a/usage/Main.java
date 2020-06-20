package com.loto.oriented.b.constructor.a.usage;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：构造器的作用
 *         （1）创建对象（必须是和new一起使用）（创建对象其实是在调用构造器）
 *         （2）完成对象的初始化操作
 */

public class Main {
	public static void main(String[] args) {
		// 构造器作用1：创建对象
		Person p = new Person("TD");
		
		// 对象p调用方法getName
		System.out.println(p.getName());
	}
}

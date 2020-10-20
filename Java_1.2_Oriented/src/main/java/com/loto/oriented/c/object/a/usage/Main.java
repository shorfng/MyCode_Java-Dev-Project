package com.loto.oriented.c.object.a.usage;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：对象的创建、对象的使用（对象的成员变量赋值、访问对象的成员变量值、调用对象的成员方法）
 */

public class Main {
	public static void main(String[] args) {
		// 创建对象
		Phone p = new Phone();
		System.out.println("输出的是(类的全限定名称@内存地址)：" + p);

		// 对象q和对象p开辟的内存空间不同，里面的成员变量和成员方法也不是同一个
		Phone q = new Phone();
		System.out.println("输出的是(类的全限定名称@内存地址)：" + q);

		// 对象的成员变量赋值
		p.brand = "华为";
		p.price = 4000.0;
		p.size = 4.0;

		// 访问对象的成员变量值
		System.out.println("===== 访问对象的成员变量 =====");
		System.out.println(p.brand);
		System.out.println(p.price);
		System.out.println(p.size);

		// 调用对象的成员方法
		System.out.println("===== 调用对象的成员方法 =====");
		p.call("CJ");
		p.sendMeg("TD");

		// 打印对象的属性值，toString方法
        System.out.println("===== 打印对象的属性值，toString方法 =====");
        System.out.println(p.toString());
	}
}

package com.loto.api.a.object.a.equals;

/**
 * Author：蓝田_Loto
 * PageName：Main.java
 * Function：object类的equals()方法
 */

public class Main {
	public static void main(String[] args) {
		// object类
		Object o1 = new Object();
		Object o2 = new Object();
		System.out.println(o1.equals(o2)); // false，地址不同（equals比较的是地址）
		System.out.println(o1 == o2);      // false，hashcode不同（==不仅比较值，还比较hashcode）

		// Person类继承Object类，重写了父类的equals方法
		Person p1 = new Person("李四", 20);
		Person p2 = new Person("张三", 20);
		System.out.println(p1.equals(p2)); // true，重写后比较的是age属性的内容
	}
}

/* 结论 */
// 1、object类的equals方法比较的是对象的内存地址，自定义类继承object类重写了equals方法后，比较的是重写的属性的内容
// 2、==不仅比较对象的内存地址，还比较hashcode
package com.loto.oriented.e.encapsulation.b.this1;

public class Person {
	// 封装成员变量
	private String name;
	private int age;

	/* ========= setter和getter方法 ========= */
	/* this使用场景1：解决成员变量和局部变量（参数）之间的重名问题 */
	// name的set方法
	public void setName(String name) {
		// 把调用者传递过来的name参数的值赋值给name字段
		this.name = name;
	}

	// name的get方法
	public String getName() {
		// 返回字段name的值
		return name;
	}

	public void setAge(int age) {
		if (age < 0 || age > 130) {
			System.out.println("输入的年龄错误");
		} else {
			this.age = age;
		}
	}

	public int getAge() {
		return age;
	}

	// this在方法中：哪个对象调用this所在的方法，此时this就表示哪个对象
	public void introduce() {
		String name = "Jan";
		int age = 14;

		// 访问的是成员变量 xx对象的name xx对象的age
		// System.out.println("我叫" + this.name + ",今年" + this.age + "岁了");

		// 访问的是局部变量
		System.out.println("我叫" + name + ",今年" + age + "岁了");
	}

	/* this使用场景2：同类中实例方法之间的互相调用问题 */
	public void show() {
		System.out.println("调用了show方法");
	}

	public void say() {
		System.out.println("调用了say方法");
		show(); // 其实是 this.show()；
	}

}

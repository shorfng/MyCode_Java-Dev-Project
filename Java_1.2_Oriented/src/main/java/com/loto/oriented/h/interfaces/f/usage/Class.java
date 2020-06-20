package com.loto.oriented.h.interfaces.f.usage;

// 接口的使用2：接口作为方法的返回值
public class Class {
	// 定义方法，方法的返回值是接口类型
	// 接口是不能创建对象的，return语句后返回的是实现类的对象
	public MyInterface Method() {
		return new MyImplement();
	}
}

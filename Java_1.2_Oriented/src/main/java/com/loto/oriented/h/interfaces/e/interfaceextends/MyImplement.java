package com.loto.oriented.h.interfaces.e.interfaceextends;

/**
 * Author：蓝田_Loto
 * PageName：.java
 * Function：接口的多继承（实现了接口C，需要重写C中全部的抽象方法，并且因为C继承了AB，所以需要重写ABC中所有的抽象方法）
 */

public class MyImplement implements Interface_C {
	public void aMethod() {
		System.out.println("重写了接口A中的抽象方法");
	}

	public void bMethod() {
		System.out.println("重写了接口B中的抽象方法");
	}

	public void cMethod() {
		System.out.println("重写了接口C中的抽象方法");
	}
}

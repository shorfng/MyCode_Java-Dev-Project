package com.loto.collections.a1.arraylist.a.useage;

import java.util.ArrayList;
import java.util.List;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 13:56
 * PageName：d_ArrayList_ImplementMethod.java
 * Function：ArrayList_实现类方法
 */

public class d_ArrayList_ImplementMethod {
	public static void main(String[] args) {
		function1();
		function2();
		function3();
	}

	// add(int index, E) 将元素插入到列表的指定索引上 带有索引的操作,防止越界问题
	private static void function1() {
		List<String> list = new ArrayList<>();
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		System.out.println(list);

		list.add(1, "增加元素");
		System.out.println(list);
	}

	// E remove(int index) 移除指定索引上的元素 返回被删除之前的元素
	private static void function2() {
		List<Double> list = new ArrayList<>();
		list.add(1.1);
		list.add(1.2);
		list.add(1.3);
		list.add(1.4);
		System.out.println("移除元素前：" + list);

		Double d = list.remove(0);

		System.out.println("被移除的元素：" + d);
		System.out.println("移除元素前：" + list);
	}

	// E set(int index, E) 修改指定索引上的元素 返回被修改之前的元素
	private static void function3() {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		Integer i = list.set(0, 5);
		
		System.out.println(i);
		System.out.println(list);
	}
}
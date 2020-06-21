package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;

/*
(1)在类中定义方法String printList(ArrayList list)
(2)方法实现：将集合内所有元素转换为一个字符串，并返回

例如：
集合内元素：10,5,90,70,66,80,88
返回的字符串：{10, 5, 90, 70, 66, 80, 88}
 */
public class g_practice7 {
	public static void main(String[] args) {
		// 创建一个集合
		ArrayList<Integer> list = new ArrayList<>();

		// 添加集合元素
		list.add(10);
		list.add(5);
		list.add(90);
		list.add(70);
		list.add(66);
		list.add(80);
		list.add(88);

		// 调用方法
		String s = printList(list);

		// 打印
		System.out.println(s);
	}

	private static String printList(ArrayList<Integer> list) {
		String str = "{";

		for (int i = 0; i < list.size(); i++) {
			if (i != list.size() - 1) {
				str += list.get(i) + ",";
			} else {
				str += list.get(i) + "}";
			}
		}
		return str;
	}
}

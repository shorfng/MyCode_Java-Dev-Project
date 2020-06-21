package com.loto.collections.a4.linkedhashset;

import java.util.LinkedHashSet;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 17:34
 * PageName：a_LinkedHashSet_Use.java
 * Function：LinkedHashSet_使用
 */

public class a_LinkedHashSet_Use {
	public static void main(String[] args) {
		LinkedHashSet<Integer> link = new LinkedHashSet<>();

		link.add(123);
		link.add(44);
		link.add(33);
		link.add(33);
		link.add(66);
		link.add(11);

		System.out.println(link); // [123, 44, 33, 66, 11]
	}
}
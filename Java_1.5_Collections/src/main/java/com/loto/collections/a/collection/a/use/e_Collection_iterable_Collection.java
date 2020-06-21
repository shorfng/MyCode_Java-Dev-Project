package com.loto.collections.a.collection.a.use;

import java.util.ArrayList;

/**
 * Author：蓝田_Loto
 * Date：2018-12-04 22:43
 * PageName：e_Collection_iterable_Collection.java
 * Function：Collection_遍历
 */

public class e_Collection_iterable_Collection {
	public static void main(String[] args) {
		ArrayList<Person> array = new ArrayList<>();

		array.add(new Person("TD", 20));
		array.add(new Person("CJ", 10));

		for (Person p : array) {
			System.out.println(p);
		}
	}

}

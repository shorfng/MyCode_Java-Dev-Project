package com.loto.collections.a1.arraylist.a.useage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Author：蓝田_Loto
 * Date：2018-12-19 13:56
 * PageName：f_ArrayList_Iterator.java
 * Function：ArrayList_迭代器
 */

// 在迭代过程中，使用了集合的方法对元素进行操作。导致迭代器并不知道集合中的变化，容易引发数据的不确定性
// 并发修改异常解决办法：在迭代时，不要使用集合的方法操作元素。

// 那么想要在迭代时对元素操作咋办？
// 通过ListIterator迭代器操作元素是可以的，ListIterator的出现，解决了使用Iterator迭代过程中可能会发生的错误情况。
public class f_ArrayList_Iterator {

	// 在list集合迭代元素中，对元素进行判断，一旦条件满足就添加一个新元素
	public static void main(String[] args) {
		// 创建List集合
		List<String> list = new ArrayList<>();

		// 给集合中添加元素
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");

		// 迭代集合，当有元素为"abc2"时，集合加入新元素"it"
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String str = it.next();
			// 判断取出的元素是否是"abc2"，是就添加一个新元素
			if ("abc2".equals(str)) {
				list.add("it"); // 该操作会导致程序出错
			}
		}
		// 打印容器中的元素
		System.out.println(list);
	}
}

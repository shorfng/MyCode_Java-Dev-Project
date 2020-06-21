package com.loto.collections.c.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("ewrew");
		list1.add("qwesd");
		list1.add("Qwesd");
		list1.add("bv");
		list1.add("wer");
		System.out.println("默认序列：" + list1);

		// 1、对于List集合,进行升序排列
		Collections.sort(list1);
		System.out.println("升序排列：" + list1);

		System.out.println("=================");

		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(5);
		list2.add(8);
		list2.add(10);
		list2.add(15);
		list2.add(20);

		// 2、根据元素对List集合进行二分搜索,返回索引值（找不到返回 -插入点-1）
		int index = Collections.binarySearch(list2, 1);
		System.out.println("索引：" + index);

		System.out.println("=================");
		
		// 3、shuffle对集合随机排列
		System.out.println("默认序列：" + list2);

		Collections.shuffle(list2);
		System.out.println("随机排列：" + list2);
	}
}

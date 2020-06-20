package com.loto.grammar.f.array.one.array;

import java.util.Random;

/* 随机点名器 功能：
（1）存储姓名
（2）预览所有人的姓名
（3）随机出一个人的姓名
 */
public class Practice_CallName {
	public static void main(String[] args) {
		// 存储姓名到数组 String
		String[] names = { "张三", "李四", "王五" };

		// 预览所有人的姓名（遍历数组）
		System.out.println("====== 预览所有人的姓名 ======");
		for (int i = 0; i < names.length; i++) {
			System.out.println("names:" + names[i]);
		}

		// 随机出一个人的姓名（随机数，生成一个整数作为索引，到数组中查找对应的元素）
		System.out.println("====== 随机点名 ======");
		Random rd = new Random();
		int index = rd.nextInt(names.length); // 范围是0-数组的最大索引
		System.out.println("随机的名字：" + names[index]);
	}
}

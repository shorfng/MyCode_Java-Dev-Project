package com.loto.grammar.d.operator;

/* 知识考察：三元运算符
定一个int类型的变量v1，初始值20；
定义一个String类型的变量v2，初始值：“”

1、请使用三元运算符判断：如果v1大于20，v2的值为：大于，
2、否则，将v2的值赋值为：不大于。
3、打印v2的值
 */
public class Practice05 {
	public static void main(String[] args) {
		int v1 = 20;
		String v2 = "";

		System.out.println(v1 > 20 ? (v2 = "大于") : (v2 = "不大于"));
	}
}
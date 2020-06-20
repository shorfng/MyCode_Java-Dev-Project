package com.loto.grammar.d.operator;

/*知识考察：三元运算符
定义一个int类型的变量v1，初始值：20
定义一个int类型的变量v2，初始值：18

使用三元运算符求两个数的最大值，并打印；
 */
public class Practice04 {
	public static void main(String[] args) {
		int v1 = 20;
		int v2 = 18;

		System.out.println("最大数是：" + (v1 > v2 ? v1 : v2 ) );  // 20
	}
}

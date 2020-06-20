package com.loto.grammar.d.operator;

/**
 * Author：蓝田_Loto
 * PageName：e_BitwiseOperator.java
 * Function：位运算符（& | ^ ~  << >>）
 */

public class e_BitwiseOperator {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;

		// & 按位与
		System.out.println("======== 按位与：二进制位运算(同1为1,有0为0) ========");
		System.out.println(9 & 13); // 9
		System.out.println("======== 按位与：逻辑运算(全真为真，一假则假) ========");
		System.out.println((a > b) & (a > c)); // false & false -> false
		System.out.println((a < b) & (a > c)); // true & false -> false
		System.out.println((a > b) & (a < c)); // false & true -> false
		System.out.println((a < b) & (a < c)); // true & true -> true

		// | 按位或
		System.out.println("======== 按位或：二进制位运算(有1为1，同0为0) ========");
		System.out.println(9 | 13); // 13
		System.out.println("======== 按位或：逻辑运算(全假为假，一真则真) ========");
		System.out.println((a > b) | (a > c)); // false | false -> false
		System.out.println((a < b) | (a > c)); // true | false -> true
		System.out.println((a > b) | (a < c)); // false | true -> true
		System.out.println((a < b) | (a < c)); // true | true -> true

		// ^ 按位异或
		System.out.println("======== 按位异或：二进制位运算(相同为0，不同为1) ========");
		System.out.println(9 ^ 13); // 4
		System.out.println("======== 按位异或：逻辑运算(相同为假，不同为真) ========");
		System.out.println((a > b) ^ (a > c)); // false ^ false -> false
		System.out.println((a < b) ^ (a > c)); // true ^ false -> true
		System.out.println((a > b) ^ (a < c)); // false ^ true -> true
		System.out.println((a < b) ^ (a < c)); // true ^ true -> false

		// ~ 按位取反
		System.out.println("======== 按位取反(0变1，1变0) ========");
		System.out.println(~9); // -10

		// << 左移：会改变一个数的正负性（左移 n 位就相当于乘以2的n次方）
		System.out.println("======== 左移(二进位左移n位，高位丢弃，低位补0) ========");
		System.out.println(8 << 3); // 等同于8*2^3 结果：64

		// >> 右移：不会改变一个数的符号（右移 n 位就相当于除以2的n次方）
		System.out.println("======== 右移(二进位右移n位，保持符号位不变) ========");
		System.out.println(8 >> 3); // 等同于8/2^3 结果：1

		// 位运算技巧：任何数和1进行&操作，得到这个数的最低位
		/*
		     1001 
           & 0001 
       ------------
             0001
		 */
	}
}

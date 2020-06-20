package com.loto.grammar.g.algorithm;

/* 打印5位数中所有的回文数
回文数举例：12321是回文数，个位与万位相同，十位与千位相同
 */
public class b_HuiWenNum {
	public static void main(String[] args) {
		System.out.println("回文数如下：");

		for (int i = 10000; i < 100000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int qian = i / 1000 % 10;
			int wan = i / 10000 % 10;

			if ((ge == wan) && (shi == qian)) {
				System.out.println(i);
			}
		}
	}
}

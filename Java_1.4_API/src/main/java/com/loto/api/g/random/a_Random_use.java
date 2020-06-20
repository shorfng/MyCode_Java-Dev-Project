package com.loto.api.g.random;

import java.util.Random;

/**
 * Author：蓝田_Loto
 * PageName：a_Random_use.java
 * Function：获取随机整数
 */

public class a_Random_use {
	public static void main(String[] args) {
		// 创建引用类型变量
		Random rd = new Random();

		// 例1：获取0-100之间的随机整数 [ 0 , 100)
		int num1 = rd.nextInt(100);
		System.out.println("产生一个[ 0 , 100)之间的随机整数是：" + num1);

		// 例2：获取1-100之间的随机整数 [ 1 , 100] ---> 等价于 [ 0 ，100) + 1
		int num2 = rd.nextInt(100) + 1;
		System.out.println("产生一个[ 1 , 100]之间的随机整数是：" + num2);

		// 例3：获取1-100之间的随机整数 [ 1 ，100) ---> 等价于 [ 0 ，99) + 1
		int num3 = rd.nextInt(99) + 1;
		System.out.println("产生一个[ 1 ，100)之间的随机整数是：" + num3);

		// 例4：获取80-90之间的随机整数 [ 80 , 90) --->等价于 [ 0 ，10) + 80
		int num4 = rd.nextInt(10) + 80;
		System.out.println("产生一个[ 80 ，90)之间的随机整数是：" + num4);
	}
}

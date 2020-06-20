package com.loto.exception.a.usage;

/**
 * Author：蓝田_Loto
 * PageName：e_Runtime.java
 * Function：运行时异常
 */

public class e_Runtime {
	public static void main(String[] args) {
		// 举例1：运行时异常，不需要处理异常，直接修改代码
		 function();

		// 举例2：传递参数0或者负数，计算的时候没有问题，但是违反了真实情况
		double d = getArea(0);
		System.out.println(d);
	}

	public static void function() {
		int[] arr = { 1, 2, 3 };
		// 对数组的5索引进行判断,如果5索引大于100,请将5索引上的数据/2,否则除以3
		// 然而，索引5根本就没有
		if (arr[5] > 100) {
			arr[5] = arr[5] / 2;
		} else {
			arr[5] = arr[5] / 3;
		}
	}

	private static double getArea(double r) {
		if (r <= 0)
			throw new RuntimeException("圆形不存在");
		return r * r * Math.PI;
	}
}

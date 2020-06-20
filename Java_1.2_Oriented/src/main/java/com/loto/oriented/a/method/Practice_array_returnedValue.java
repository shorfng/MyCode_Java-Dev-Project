package com.loto.oriented.a.method;

// 数组作为返回值：将传递给方法的两个数的加减乘除结果返回给数组brr，并遍历brr
public class Practice_array_returnedValue {
	public static void main(String[] args) {
		int[] brr = get(1, 2);

		// 打印结果：3 -1 2 0
		for (int i = 0; i < brr.length; i++) {
			System.out.println(brr[i]);
		}
	}

	// int[] 是数组类型的返回值类型
	private static int[] get(int a, int b) {
		int[] arr = new int[4];

		arr[0] = a + b;
		arr[1] = a - b;
		arr[2] = a * b;
		arr[3] = a / b;

		return arr; // 返回的数组
	}
}

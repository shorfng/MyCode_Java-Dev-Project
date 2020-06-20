package com.loto.exception.a.usage;

/**
 * Author：蓝田_Loto
 * PageName：b_trycatch.java
 * Function：捕获异常
 */

public class b_trycatch {
	public static void main(String[] args) {
		int[] arr = null;

		// 捕获异常
		try {
			int i = getArray(arr);
			System.out.println(i);
		} catch (NullPointerException ex) {
			System.out.println("异常信息：" + ex);
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("异常信息：ArrayIndexOutOfBoundsException，数组越界" + ex);
		}
	}

	// 定义方法，抛出异常，调用者使用try catch
	private static int getArray(int[] arr) throws NullPointerException, ArrayIndexOutOfBoundsException {
		// 对数组判空
		if (arr == null) {
			// 手动抛出异常,抛出空指针异常
			throw new NullPointerException("空指针异常");
		}

		// 对数组的索引进行判断
		if (arr.length < 3) {
			// 手动抛出异常,抛出数组的索引越界异常
			throw new ArrayIndexOutOfBoundsException("数组没有3索引");
		}
		return arr[3] + 1;
	}
}

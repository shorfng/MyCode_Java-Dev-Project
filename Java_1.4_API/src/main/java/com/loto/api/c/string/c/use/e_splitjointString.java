package com.loto.api.c.string.c.use;

/**
 * Author：蓝田_Loto
 * PageName：e_splitjointString.java
 * Function：把数组中的数据按照指定格式拼接成一个字符串
 */

// 举例：int[] arr = {1,2,3};
// 输出结果：[1, 2, 3]
public class e_splitjointString {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		String str = "[";

		// 遍历数组
		for (int i = 0; i < arr.length; i++) {
			if (i != arr.length - 1) {
				str += arr[i] + ","; // 如果不是最后一个元素，则arr[i]后加 ，
			} else {
				str += arr[i] + "]"; // 如果是最后一个元素，则arr[i]后加 ]
			}
		}
		System.out.println("输出结果：" + str);
	}
}

package com.loto.oriented.a.method;

/**
 * Author：蓝田_Loto
 * PageName：d_Overload_Equal.java
 * Function：方法重载：比较两个数据是否相等
 */

public class d_Overload_Equal {
	public static void main(String[] args) {
		System.out.println("两个byte类型" + compare((byte) 10, (byte) 20));
		System.out.println("两个short类型" + compare((short) 10, (short) 20));
		System.out.println("两个int类型" + compare(10, 20));
		System.out.println("两个long类型" + compare(10L, 20L));
	}

	// 比较两个 byte 类型是否相等
	private static boolean compare(byte a, byte b) {
		System.out.println("byte");
		return a == b;
	}

	// 比较两个 short 类型是否相等
	private static boolean compare(short a, short b) {
		System.out.println("short");
		return a == b;
	}

	// 比较两个 int 类型是否相等
	private static boolean compare(int a, int b) {
		System.out.println("int");
		return a == b;
	}

	// 比较两个 long 类型是否相等
	private static boolean compare(long a, long b) {
		System.out.println("long");
		return a == b;
	}
}

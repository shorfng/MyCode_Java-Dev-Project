package com.loto.oriented.a.method;

// 功能：在控制台输出一个6行7列的星形图形
public class Practice_PrintGraph {
	public static void main(String[] args) {
		printgraph(6, 7);
	}

	private static void printgraph(int n, int m) {
		for (int i = 0; i < n; i++) {     // 外层循环控制行
			for (int j = 0; j < m; j++) { // 内层循环控制列
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

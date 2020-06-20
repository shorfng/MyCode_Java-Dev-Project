package com.loto.oriented.a.method;

// 定义一个方法，把所有的水仙花数打印在控制台
public class Practice_WaterFlower {
	public static void main(String[] args) {
		waterflower();
	}

	private static void waterflower() {
		for (int i = 100; i < 1000; i++) {
			int ge = i % 10;
			int shi = i / 10 % 10;
			int bai = i / 100 % 10;

			if (ge * ge * ge + shi * shi * shi + bai * bai * bai == i) {
				System.out.println("水仙花数是：" + i);
			}
		}
	}
}

package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;
import java.util.Random;

/* 拟双色球彩票机选程序:
双色球规则 :    
一共选 7 个号. 6个红色, 1个蓝色的 
红色球1-33号中选6个号码不能重复
蓝色球1-16号选1个

打印出机选结果格式(前6个为红球，最后一个为篮球，数字是随机生成的，每次运行结果都不一样) :

本期中奖号码为:[7, 27, 25, 6, 4, 9, 12]
*/
public class l_practice12 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		Random rd = new Random();

		// 生成6个红球并保存到集合中
		while (list.size() < 6) {
			int red = rd.nextInt(33) + 1;
			int j = 0;

			// 如果红色球的号码重复，则j++
            for (Integer integer : list) {
                if (integer.equals(red)) {
                    j++;
                }
            }
			// 如果没有重复的红球，则添加到集合
			if (j == 0) {
				list.add(red);
			}
		}

		// 再生成1个蓝色的球，并添加到集合中
		int blue = rd.nextInt(16) + 1; // 蓝色球
		list.add(blue);

		// 打印结果
		System.out.println("本期中奖号码为:" + list);
	}
}
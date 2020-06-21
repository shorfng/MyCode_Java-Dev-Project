package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;

/*
集合中添加若干菜品对象.
遍历集合,打印出集合中所有菜品名称和消费总金额.
 */
public class k_practice11 {
	public static void main(String[] args) {
		ArrayList<Cai> list = new ArrayList<>();

		list.add(new Cai("烤羊腿", 58, 4));
		list.add(new Cai("皮蛋豆腐", 8, 1));
		list.add(new Cai("烤板筋", 2, 10));
		list.add(new Cai("可乐", 8, 1));

		double total = 0.0;

        for (Cai c : list) {
            System.out.println("菜名：" + c.getName() + " -- " + c.getNum() + "份");

            total += c.getPrice() * c.getNum();
        }
		System.out.println("总价：" + total);
	}
}

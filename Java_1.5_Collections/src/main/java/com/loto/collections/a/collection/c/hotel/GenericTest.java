package com.loto.collections.a.collection.c.hotel;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericTest {
	public static void main(String[] args) {
		// 将酒店厨师、服务员、经理分别存储到3个集合中
		ArrayList<ChuShi> cs = new ArrayList<>();
		ArrayList<FuWuYuan> fwy = new ArrayList<>();
		ArrayList<JingLi> jl = new ArrayList<>();

		// 向集合中存储元素
		cs.add(new ChuShi("厨师1", "001"));
		cs.add(new ChuShi("厨师2", "002"));

		fwy.add(new FuWuYuan("服务员1", "001"));
		fwy.add(new FuWuYuan("服务员2", "002"));

		jl.add(new JingLi("经理1", "001", 123456789.32));
		jl.add(new JingLi("经理2", "002", 123456789.33));

		iterator(jl);
		iterator(fwy);
		iterator(cs);
	}

	// 定义方法：同时遍历3个集合、同时可以调用work方法
	private static void iterator(ArrayList<? extends Employee> array) {
		Iterator<? extends Employee> it = array.iterator();
		while (it.hasNext()) {
			// next（）获取的是Employee类型
			Employee e = it.next();
			e.work();
		}
	}
}

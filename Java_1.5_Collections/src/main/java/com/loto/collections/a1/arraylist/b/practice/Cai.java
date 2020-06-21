package com.loto.collections.a1.arraylist.b.practice;

// 菜品类
public class Cai {
	private String name;  // 名称
	private int price;    // 价格
	private int num = 1;  // 数量（默认一份）

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Cai(String name, int price, int num) {
		super();
		this.name = name;
		this.price = price;
		this.num = num;
	}

	public Cai() {
	}
}

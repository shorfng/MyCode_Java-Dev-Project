package com.loto.pattern.a.principle.a.OCP;

/**
 * Author：蓝田_Loto
 * Date：2019-07-05 13:24
 * PageName：JavaCourse.java
 * Function：java课程类
 */

public class JavaCourse implements ICourse{
    private Integer id;   // 课程id
    private String name;  // 课程标题
    private Double price; // 价格

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
	public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
	public Double getPrice() {
        return price;
    }
}

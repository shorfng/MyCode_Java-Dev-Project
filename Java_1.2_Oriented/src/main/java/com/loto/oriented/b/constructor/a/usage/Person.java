package com.loto.oriented.b.constructor.a.usage;

public class Person {
    // 成员变量
    private String name;

    // setter和getter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 构造器的分类1：编译器创建的默认构造器
    public Person() {
    }

    // 构造器的分类2：自定义构造器
    public Person(String n) {
        // 构造器作用2：可以在此处进行初始化操作（可以给字段设置初始值，也可以调用初始化方法）
        name = n; // 把参数 n 的值赋值给name
    }
}

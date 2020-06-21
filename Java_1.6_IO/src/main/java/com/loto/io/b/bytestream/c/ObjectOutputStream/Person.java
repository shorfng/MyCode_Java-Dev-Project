package com.loto.io.b.bytestream.c.ObjectOutputStream;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L; // 序列版本号：验证序列化的对象和对应类是否版本匹配
    private static String sex;      // 静态修饰不会被序列化
    private transient int address;  // 瞬态修饰不会被序列化
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

package com.loto.api.a.object.a.equals;

public class Person extends Object {
    private String name;
    private int age;

    //  person类的构造方法
    public Person() {
        super();
    }

    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // Person类重写了Object类的equals方法，不比较地址值，比较对象属性内容
    @Override
    public boolean equals(Object obj) {
        // 比较的是两个对象的内存地址，没有意义
        // return this == obj;

        // 比较两个对象的成员变量
        // 1、判断当前调用equals方法的对象和传递进来的对象是否是同一个
        if (this == obj) {
            return true;
        }

        // 2、对参数obj进行非空判断
        if (obj == null) {
            return false;
        }

        // 3、类型判断（参数obj接受到是Person对象才能转型）
        if (obj instanceof Person) {
            Person p = (Person) obj;  // 向下转型：obj -> Perosn类型，访问其属性
            return this.age == p.age;
        }
        return false;
    }

    //  成员变量的setter和getter方法
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
}
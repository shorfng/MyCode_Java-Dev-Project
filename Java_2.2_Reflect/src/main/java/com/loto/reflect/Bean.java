package com.loto.reflect;

public class Bean {
    private String id;
    private String className;
    public String description;

    // 无参构造
    public Bean() {
    }

    // 有参构造
    public Bean(String id, String className) {
        this.id = id;
        this.className = className;

        System.out.println("id：" + id);
        System.out.println("className：" + className);
    }

    // 私有构造（暴力反射）
    private Bean(String id) {
        this.id = id;
        System.out.println("id：" + id);
    }

    // 私有方法（暴力反射）
    private String show() {
        System.out.println("私有方法执行");
        return "Bean[" + id + ", " + className + "]";
    }

    // main方法
    public static void main(String[] args) {
        System.out.print("参数为：");

        // 打印所有的参数
        for (String arg : args) {
            System.out.print(arg + ", ");
        }

        System.out.println();
    }

    // setter、getter方法
    public String getId() {
        System.out.println("getId方法执行");
        return id;
    }

    public void setId(String id) {
        System.out.println("setId方法执行：" + id);
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.loto.collections.a1.arraylist.b.practice;

public class Student {
	// 成员变量
    private String id;
    private String name;
    private String age;
    private String home;
    private double english; // 英语成绩
    private double math;    // 数学成绩
    private double java;    // java成绩

    public double getEnglish() {
        return english;
    }

    public void setEnglish(double english) {
        this.english = english;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public double getJava() {
        return java;
    }

    public void setJava(double java) {
        this.java = java;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    // 有参的构造方法
    public Student(String id, String name, String age, String home) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Student(String name, double english, double math, double java) {
        this.name = name;
        this.english = english;
        this.math = math;
        this.java = java;
    }

    // 无参的构造方法
	public Student() {

	}
}

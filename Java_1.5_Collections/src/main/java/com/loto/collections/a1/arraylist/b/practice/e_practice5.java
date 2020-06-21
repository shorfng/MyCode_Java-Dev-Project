package com.loto.collections.a1.arraylist.b.practice;

import java.util.ArrayList;
import java.util.Scanner;

/* 学生管理系统
 * 学生信息：学号、姓名、年龄、家乡
 * 打印欢迎界面，打印相应的功能，并接收用户的输入

（1）查看：判断集合中是否有元素
   如果没有元素，打印提示
   如果有元素，按照指定的格式，遍历集合打印学生信息
   
如果系统没有学生信息，则给出对应的提示
如果系统中有学生信息，则按照指定的格式打印学生信息

（2）添加
   提示输入学号
   根据学号去重
   收集其他信息
   组成对象，添加到集合中

从键盘录入学生信息，组成对象，添加到集合中
根据学号去重，只有学号不重复，才能添加到集合中

（3）修改
   提示输入学号
   根据学号查找元素
     如果没有找到，给出提示
     如果找到，则接收新数据，并使用新信息修改原来的元素

（4）删除
    提示输入学号
	根据学号查找元素
		如果没有找到，给出提示
	    如果找到，则删除元素
根据学号删除学生
如果没有该学号，则给出指定的提示
如果有该学号，则删除指定的元素，并提示删除完毕

（5）退出
提示退出，并结束程序
 */
public class e_practice5 {
	public static void main(String[] args) {
		// 1、初始化数据 创建一个集合容器，可以存储学生的信息
		ArrayList<Student> list = new ArrayList<>();

		System.out.println("================= 欢迎使用学生管理系统 =================");

		// 2、死循环
		while (true) {
			// 展示功能菜单
			System.out.println("--------------------------------");
			System.out.println("1.查看学生信息");
			System.out.println("2.添加学生信息");
			System.out.println("3.修改学生信息");
			System.out.println("4.删除学生信息");
			System.out.println("5.退出学生管理系统");
			System.out.println("请输入对应功能的序号：");
			System.out.println("---------------------------------");

			// 接收用户的输入
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();

			// 根据用户的输入进行功能调用
			switch (num) {
			case 1:
				show(list);
				break;
			case 2:
				add(list);
				break;
			case 3:
				update(list);
				break;
			case 4:
				del(list);
				break;
			case 5:
				System.out.println("感谢使用学生管理系统，欢迎下次再来！");

				System.exit(0); // 方法1：终止虚拟机
				// return;            // 方法2：终止main方法
			default:
				System.out.println("没有该功能，请检查功能序号");
				break;
			}
		}
	}

	// 查看学生信息的功能方法
	private static void show(ArrayList<Student> list) {
		// 判断集合中是否有元素
		if (list.size() == 0) { // 如果没有元素，打印提示
			System.out.println("系统中没有学生信息，请选择添加功能！");
		} else { // 如果有元素，按照指定的格式，遍历集合打印学生信息
			System.out.println("====================学生信息如下=====================");
			System.out.println("学号\t\t姓名\t\t年龄\t\t家乡");
            for (Student ss : list) {
                System.out.println(ss.getId() + "\t\t" + ss.getName() + "\t\t" + ss.getAge() + "\t\t" + ss.getHome());
            }
			System.out.println("学生信息展示完毕！");
			System.out.println("===================================================");
		}
	}

	// 添加学生信息的功能方法
	public static void add(ArrayList<Student> list) {
		// 1、提示输入学号
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号：");
		String id = sc.next();

		// 2、根据学号去重
		while (true) {
			// 定义一个标记
			int index = -1;
			// 遍历集合，获取元素的学号与用户输入的学号比较
			for (int i = 0; i < list.size(); i++) {
				Student ss = list.get(i);
				if (ss.getId().equals(id)) { // 如果找到的与用户输入的学号一样，表示有重复
					// 修改标记
					index = i;
					break; // 检测到有重复的id，就停止遍历后面的
				}
			}

			if (index == -1) { // 没有重复，直到用户输入的学号与集合中的元素的序号不一致的时候再收集其他信息
				break; // 跳出while死循环
			} else { // 有重复，此时提示继续输入学号，并继续去重
				System.out.println("您输入的学号重复了，请重新输入学号：");
				id = sc.next();
			}
		}

		// 3、收集其他信息
		System.out.println("请输入姓名：");
		String name = sc.next();
		System.out.println("请输入年龄：");
		String age = sc.next();
		System.out.println("请输入家乡：");
		String home = sc.next();

		// 4、组成对象，添加到集合中
		Student s = new Student(id, name, age, home);
		list.add(s);

		System.out.println("添加完毕");
	}

	// 修改学生信息的功能方法
	private static void update(ArrayList<Student> list) {
		// 1、提示输入学号
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号：");
		String id = sc.next();

		// 2、根据学号查找元素
		// 定义标记
		int index = -1;
		// 遍历并比较
		for (int i = 0; i < list.size(); i++) {
			Student ss = list.get(i);
			if (ss.getId().equals(id)) {
				// 修改标记
				index = i;
				break;
			}
		}

		// 判断标记
		if (index == -1) { // 如果没有找到，给出提示
			System.out.println("您输入的学号，系统中没有，请重新选择功能：");
		} else { // 如果找到，则接收新数据，并使用新信息修改原来的元素
			System.out.println("请输入新姓名：");
			String name = sc.next();
			System.out.println("请输入新年龄：");
			String age = sc.next();
			System.out.println("请输入新家乡：");
			String home = sc.next();

			// 组成对象，添加到新集合中
			Student s = new Student(id, name, age, home);
			list.set(index, s);
			System.out.println("修改完毕");
		}
	}

	// 删除学生信息的功能方法
	private static void del(ArrayList<Student> list) {
		// 1、提示输入学号
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入学号：");
		String id = sc.next();

		// 2、根据学号查找元素
		// 定义标记
		int index = -1;
		// 遍历并比较
		for (int i = 0; i < list.size(); i++) {
			Student ss = list.get(i);
			if (ss.getId().equals(id)) {
				// 修改标记
				index = i;
				break;
			}
		}

		// 判断标记
		if (index == -1) { // 如果没有找到，给出提示
			System.out.println("您输入的学号，系统中没有，请重新选择功能：");
		} else { // 如果找到，则删除元素
			list.remove(index);
			System.out.println("删除完毕");
		}
	}
}

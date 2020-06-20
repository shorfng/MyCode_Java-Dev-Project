package com.loto.oriented.g.polymorphism.f.instanceofsymbol;

/*  instanceof 比较运算符
 如果传递一个实例变量参数(如下面的ani)：
（1）需要这个实例变量是本类、或子类、或接口
（2）如果是其他类型的，则需要强转成本类、或子类、或接口
 */
public class Person {
	// 传递进来的参数是Animal类型的对象
	public void function(Animal ani) {
		if (ani instanceof Dog) {  // 如果ani对象是狗类实例
			Dog dog = (Dog) ani;   // 把ani对象强转成Dog类型
			dog.Watch();
		} else if (ani instanceof Cat) { // 如果ani对象是猫类的实例
			Cat cat = (Cat) ani;         // 把ani对象强转成Cat类型
			cat.catchMouse();
		}
	}
}

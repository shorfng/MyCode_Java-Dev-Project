package com.loto.api.a.object.b.hashCode;

/**
 * Author：蓝田_Loto
 * PageName：HashCode.java
 * Function：object类的hashCode()方法
 */

// hashCode决定了对象在哈希表中的存储位置，不同对象的hashCode不同
public class HashCode {
	public static void main(String[] args) {
		String str1 = new String("TD");
		String str2 = new String("TD");
		String str3 = "TD";
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
	}
}

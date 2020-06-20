package com.loto.api.d.stringbuffer;

/**
 * Author：蓝田_Loto
 * PageName：com.loto.dateformat.b_MemberMethod.java
 * Function：StringBuffer_成员方法
 */

/*
1、[StringBuffer] append(String str)                         将指定字符串追加到此字符序列
2、[StringBuffer] delete(int start, int end)                 移除此序列的子字符串中的字符
3、[StringBuffer] insert(int offset, String str)             将字符串插入此字符序列中
4、[StringBuffer] replace(int start, int end, String str)    使用给定string中的字符替换此序列的子字符串中的字符
5、[StringBuffer] reverse()                                  将此字符序列用其反转形式取代
6、[String] toString()                                       返回此序列中数据的字符串表示形式
*/

public class b_MemberMethod {
	public static void main(String[] args) {
		// 创建 StringBuffer
		StringBuffer sb = new StringBuffer();

		// 1、 [StringBuffer] append(String str) 将指定字符串追加到此字符序列
		sb.append(1).append(2).append(3);
		System.out.println(sb); // 123

		// 2、[StringBuffer] delete(int start, int end) 移除此序列的子字符串中的字符
		// sb.delete(0, sb.length()); // 删除全部
		sb.delete(1, 2); // 移除索引1-2，包括start，不包括end
		System.out.println(sb); // 13

		// 3、[StringBuffer] insert(int offset, String str) 将字符串插入此字符序列中
		sb.insert(0, "0");
		System.out.println(sb); // 013

		// 4、[StringBuffer] replace(int start, int end, String str)
		// 使用给定string中的字符替换此序列的子字符串中的字符
		sb.replace(0, 2, "2");
		System.out.println(sb); // 23

		// 5、[StringBuffer] reverse() 将此字符序列用其反转形式取代
		sb.reverse();
		System.out.println(sb); // 32

		// 6、[String] toString() 返回此序列中数据的字符串表示形式
		sb.toString();
		System.out.println(sb);  // 32 （字符串对象）
	}
}

package com.loto.exception.a.usage;

/**
 * Author：蓝田_Loto
 * PageName：f_method.java
 * Function：异常中的常用方法
 */

// getMessage：返回该异常的详细信息字符串，即异常提示信息，对异常信息的详细描述
// toString：返回该异常的名称与详细信息字符串，对异常信息的简短描述
// printStackTrace：在控制台输出该异常的名称与详细信息字符串、异常出现的代码位置，将异常信息追踪到标准的错误流（异常信息最全，JVM默认调用方法也是这个方法）

public class f_method {
	public static void main(String[] args) {
		try {
			function();
		} catch (Exception ex) {
			// System.out.println(ex.getMessage());  // 异常了!
			// System.out.println(ex.toString());    // java.lang.Exception: 异常了!
			ex.printStackTrace();                    // java.lang.Exception: 异常了! + 错误位置
		}
	}

	public static void function() throws Exception {
		throw new Exception("异常了!");
	}
}
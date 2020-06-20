package com.loto.exception.b.customexception;

/**
 * Author：蓝田_Loto
 * PageName：CustomRuntimeException.java
 * Function：自定义异常继承RuntimeException
 */

public class CustomRuntimeException extends RuntimeException { // 此处继承运行时异常
	// 构造方法中，super将异常信息传递给父类
	public CustomRuntimeException(String s) {
		super(s);
	}

	// 必须提供一个空参构造器
	public CustomRuntimeException() {
	}
}

package com.loto.pattern.a.principle.c.SRP.method;

/**
 * Author：蓝田_Loto
 * Date：2020-06-04 13:51
 * PageName：Method.java
 * Function：方法层面的单一职责原则
 */

public class Method {

	private void modifyUserInfo(String userName, String address) {
		userName = "TD";
		address = "Beijing";
	}

	// 使用单一职责原则后，解耦
	private void modifyUserName(String userName) {
		userName = "TD";
	}

	private void modifyAddress(String address) {
		address = "Beijing";
	}

}

package com.loto.exception.a.usage;

// 继承后，在子类重写父类方法的时候异常处理
public class g_override {
	public static void main(String[] args) {
		Fu f = new Zi();
		f.function();
	}
}

// 父类不抛出异常
class Fu {
	public void function() {
	}
}

// 子类抛出异常（只能使用try catch）
class Zi extends Fu {
	public void function() {
		try {
			method();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private void method() throws Exception {
	}
}

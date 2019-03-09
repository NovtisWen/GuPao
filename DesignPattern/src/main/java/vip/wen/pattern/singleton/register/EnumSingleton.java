package vip.wen.pattern.singleton.register;

/**
 * 枚举式单例
 * @author Administrator
 * 枚举单例 是如何避免 序列化 方式的入侵
 * 从JDK层面九尾枚举不被序列化和反射破坏来保驾护航
 */
public enum EnumSingleton {
	//枚举声明的名字，JVM可以通过类名加、名字去确定一个枚举值
	INSTANCE;
	
	private Object data;
	
	public static EnumSingleton getInstatnce() {
		return INSTANCE;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}

package vip.wen.pattern.singleton.lazy;

/**
 * 懒汉式
 * @author Administrator
 *
 */
public class LazyDoubleCheckSingleton {
	
	private volatile static LazyDoubleCheckSingleton lazy = null;
	
	private LazyDoubleCheckSingleton() {}
	
	/**
	 * 双重检查锁
	 * @return
	 */
	public static LazyDoubleCheckSingleton getInstance() {
		if(lazy == null) {//1 外层if是为了能进入
			synchronized(LazyDoubleCheckSingleton.class) {
				if(lazy == null) {//2
					lazy = new LazyDoubleCheckSingleton();
					//CPU执行时会转换成JVM指令执行
					//2、3步会出现不一致，指令重排序的问题，volatile
					//1、分配内存给这个对象
					//2、初始化对象
					//3、将初始化好的对象和内存地址建立关联，赋值
					//4、用户初次访问
				}
			}
		}
		return lazy;
	}
	
}

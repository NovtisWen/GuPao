package vip.wen.pattern.singleton.threadlocal;

/**
 * 模拟ThradLocal
 * @author Administrator
 * 伪线程安全
 * 使用ThreadLocal来实现多数据源动态切换
 * Spring源码的时候，会手写ORM并且实现多数据源动态切换
 */
public class ThreadLocalSingleton {

	private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance = 
		new ThreadLocal<ThreadLocalSingleton>(){
			protected ThreadLocalSingleton initialValue() {
				return new ThreadLocalSingleton();
			}
		};
	
	public static ThreadLocal<ThreadLocalSingleton> getInstance() {
		return threadLocalInstance;
	}

}

package vip.wen.pattern.singleton.lazy;

/**
 * 懒汉式
 * @author Administrator
 *
 */
public class LazySimpleSingleton {
	
	private static LazySimpleSingleton lazy = null;
	
	private LazySimpleSingleton() {}
	
	/**
	 * 多线程解决
	 * @return
	 */
	public synchronized static LazySimpleSingleton getInstance() {
		if(lazy == null) {
			lazy = new LazySimpleSingleton();
		}
		return lazy;
	}
	
}

package vip.wen.pattern.singleton.hungry;
/**
 * 饿汉式 ，线程安全的
 * @author Administrator
 *
 */
public class SeriableSingleton {
	
	
	public final static SeriableSingleton INSTANCE = new SeriableSingleton();
	
	private SeriableSingleton() {
		
	}
	
	public synchronized static SeriableSingleton getInstance() {
		return INSTANCE;
	}
	
	private Object readResolve() {
		return INSTANCE;
	}
}

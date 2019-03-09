package vip.wen.pattern.singleton.hungry;

public class HungrySingleton {
	
	
	public final static HungrySingleton SINGLETON = new HungrySingleton();
	
	private HungrySingleton() {
		
	}
	
	public synchronized static HungrySingleton getInstance() {
		return SINGLETON;
	}
}

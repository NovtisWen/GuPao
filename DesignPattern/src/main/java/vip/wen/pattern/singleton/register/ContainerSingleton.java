package vip.wen.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/**
 * 模拟Spring IOC容器的单例模式
 * @author Administrator
 *
 */
public class ContainerSingleton {
	
	private ContainerSingleton() {}
	
	private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();
	
	
	//对象方便管理，其实也是属于懒加载
	//会存在线程安全问题
	//使用dubboCheck的方式解决即可
	public static Object getBean(String className) {
		synchronized(ioc) {
			if(!ioc.containsKey(className)) {
				Object obj = null;
				try {
					obj = Class.forName(className).newInstance();
					ioc.put(className, obj);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return obj;
			}
			return ioc.get(className);
		}
	}
	
}

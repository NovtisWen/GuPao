package vip.wen.pattern.singleton;

import java.lang.reflect.Constructor;

import vip.wen.pattern.singleton.lazy.LazyInnerClassSingleton;

/**
 * 反射破坏单例
 * @author Administrator
 *
 */
public class LazyInnerClassSingletonTest {
	
	public static void main(String[] args) {
		
		try {
			
			//反射破坏
			Class<?> clazz = LazyInnerClassSingleton.class;
			Constructor  c = clazz.getDeclaredConstructor(null);
			c.setAccessible(true);
			Object o1 = c.newInstance();
			Object o2 = LazyInnerClassSingleton.getInstance();
			System.out.println(o1 == o2);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
}

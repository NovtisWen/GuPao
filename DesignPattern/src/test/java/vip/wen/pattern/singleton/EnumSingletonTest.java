package vip.wen.pattern.singleton;

import java.lang.reflect.Constructor;

import org.junit.Test;

import vip.wen.pattern.singleton.register.EnumSingleton;

/**
 * 枚举破坏
 * @author Administrator
 *
 */
class EnumSingletonTest {

	@Test
	void invokeTest() {
		try {
			//枚举单例，尝试反射破坏
			Class<?> clazz = EnumSingleton.class;	
			Constructor  c = clazz.getDeclaredConstructor(String.class,int.class);
			c.setAccessible(true);
			EnumSingleton obj = (EnumSingleton) c.newInstance("Tom",666);
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

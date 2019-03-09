package vip.wen.pattern.singleton;

import org.junit.Test;

import vip.wen.pattern.singleton.register.ContainerSingleton;

/**
 * 序列化破坏单例
 * @author Administrator
 *
 */
class ContainerSingletonTest {

	@Test
	void invokeTest() {
		try {
			Object obj = ContainerSingleton.getBean("vip.wen.pattern.singleton.register.ContainerSingleton");
			System.out.println(System.currentTimeMillis()+" "+obj);
			
			
			System.out.println(obj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}

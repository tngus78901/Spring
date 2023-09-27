package sub1;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * Date : 27th, September 023
 * Name : Justina
 * Content : to practice Spring IoC 
 */

public class IocMain {
	
		public static void main(String[] args) {
			
			// 스프링 컨텍스트(컨테이너) 객체 생성 to create an object Spring context(container)
			ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
			
			LgTV 1g = (LgTV) ctx.getBean("1g");
			lg.powerOn();
			lg.soundUp();
			lg.soundDown();
			lg.powerOff();
		}

}

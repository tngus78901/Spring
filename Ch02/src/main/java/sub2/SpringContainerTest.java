package sub2;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * Date : 27th September 2023
 * Name : Justina
 * Content : to practice Spring Container
 * 
 * DI 
 *  - DI(Dependency Injection)는 의존성 주입 의미로 객체를 생성하는 방식이 아닌 컨테이너로 부터 주입받는 방식
 *  - 생성자, 세터, 핃트 3가지 주입 방식
 *  - @Component 선언으로 객체를 컨테이너에 관리/등록
 *  - @Component는 @Controller, @Service, @Repository로 세분화
 * 
 */
public class SpringContainerTest {

	 	public static void main(String[] args) {
	 		
	 		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
	 		
	 		Computer com = (Computer) ctx.getBean("com");
	 		com.show();
	 	}
}

package pl.biniek;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		String string = context.getBean("someString", String.class);
		System.out.println("string");
		
		  User user2 = context.getBean("someUser2", User.class);
		  System.out.println(user2.getAdddres());
		  
		  User user3 = context.getBean("someUser3", User.class);
		  System.out.println(user3);
		  InjectedBean bean = context.getBean("injectedBean2", InjectedBean.class);
		  System.out.println(bean.getName());
		  
	}

}

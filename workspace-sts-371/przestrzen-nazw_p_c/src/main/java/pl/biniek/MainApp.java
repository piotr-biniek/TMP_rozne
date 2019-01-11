package pl.biniek;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		Locale locale = Locale.getDefault();
//		Calendar calendar = GregorianCalendar.getInstance(locale);		
//		DateFormat formatter =new SimpleDateFormat().getInstance();
		
		
		ApplicationContext context =  new ClassPathXmlApplicationContext("context.xml");
		
		JakisBean bean = context.getBean("jakisBean", JakisBean.class);
		System.out.println(bean);
		
		//ApplicationContext context =  new ClassPathXmlApplicationContext("context.xml");
		
		JakisBean bean2 = context.getBean("jakisBean2", JakisBean.class);
		System.out.println(bean2.getUser().getName());
		
		
	}
		
	}



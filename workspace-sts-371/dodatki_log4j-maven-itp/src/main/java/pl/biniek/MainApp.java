package pl.biniek;




import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

import org.apache.log4j.lf5.Log4JLogRecord;
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
		
		Log4JLogRecord logger = new Log4JLogRecord();
		ApplicationContext context =  new ClassPathXmlApplicationContext("context.xml");
		 String string = context.getBean("string", String.class);
		 System.out.println(string);
		 System.out.println("DUPAAAAAAAA");
		
		
	}

}

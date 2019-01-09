package pl.biniel;

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
		Calendar calendar = context.getBean("calendar", Calendar.class);
		DateFormat formatter = (DateFormat)context.getBean("formatter");// z rzutowaniem
		
		
		
		System.out.println(formatter.format(calendar.getTime()));
		
		
		
	}

}

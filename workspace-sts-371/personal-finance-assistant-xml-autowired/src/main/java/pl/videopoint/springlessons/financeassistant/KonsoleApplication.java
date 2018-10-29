package pl.videopoint.springlessons.financeassistant;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
import pl.videopoint.springlessons.financeassistant.services.SecondRateConversionService;

public class KonsoleApplication {
	//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);
	

//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("/pl/videopoint/springlessons/financeassistant/appconfig.xml");// konteks adnotacyjny!!
		// używamy konfigu adnotacyjnego
		RateConversionService service = context.getBean(RateConversionService.class);
		service.convertAmount(BigDecimal.valueOf(123.00), "EUR");
		
		//SecondRateConversionService service2 = context.getBean(SecondRateConversionService.class);
		//service2.convertAmount(BigDecimal.valueOf(124.00), "EUR");

	}

}

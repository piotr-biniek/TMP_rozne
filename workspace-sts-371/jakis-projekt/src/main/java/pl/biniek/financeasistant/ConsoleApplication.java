package pl.biniek.financeasistant;

import java.math.BigDecimal;
import pl.biniek.financeasistant.*;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.biniek.financeasistant.services.RateConversionService;

public class ConsoleApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		RateConversionService service = context.getBean(RateConversionService.class);
		service.convertAmount(BigDecimal.valueOf(123.00), "EUR");

	}

}

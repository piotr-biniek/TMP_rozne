package pl.videopoint.springlessons.financeassistant;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.videopoint.springlessons.financeassistant.services.RateConversionService;

public class ConsoleApplication {

	public static void main(String[] args) {
		//System.out.println("Autowired CD!!");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		RateConversionService service = context.getBean(RateConversionService.class);
		service.convertAmount(BigDecimal.valueOf(123.00), "EUR");

		System.out.println("Autowired with MAP");
	}

}

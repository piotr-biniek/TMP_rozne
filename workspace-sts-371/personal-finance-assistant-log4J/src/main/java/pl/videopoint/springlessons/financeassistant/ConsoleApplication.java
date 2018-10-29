package pl.videopoint.springlessons.financeassistant;

import java.math.BigDecimal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pl.videopoint.springlessons.financeassistant.services.RateConversionService;

public class ConsoleApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class, AppConfigProd.class);
		RateConversionService service = context.getBean(RateConversionService.class);
		service.convertAmount(BigDecimal.valueOf(123.00), "EUR");

	}

}

// przy dodawaniu lig4j potrzeba dodoać most slf4j do log4j, wylaczyc springowe logowanie, kilka wpisów w pom.xml
// utworzyc konfig log4j s pliku xml
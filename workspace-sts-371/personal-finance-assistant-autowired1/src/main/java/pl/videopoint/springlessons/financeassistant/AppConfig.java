package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FileCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;

@Configuration
public class AppConfig {
	
	@Bean
	public CurrencyRateProvider fileCurrencyRateProvider() {
		return new FileCurrencyRateProvider();
	}
	
	@Bean
	public RateConversionService rateConvesionService(CurrencyRateProvider crp) {// najprostrzy automatyczny autowired kontener szuka z beanów który pasuje i go wstawia do interfacu!
		RateConversionService rateConversionService = new RateConversionService();// bean podany wyżej!
		rateConversionService.setRateProvider(crp);
		return rateConversionService;
	}

}

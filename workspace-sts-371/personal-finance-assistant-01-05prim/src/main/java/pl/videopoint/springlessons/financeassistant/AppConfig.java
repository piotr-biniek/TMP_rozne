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
	public RateConversionService rateConvesionService(CurrencyRateProvider crp) {//pierwszy autowired bez autowired :) podajemy interfejs
		RateConversionService rateConversionService = new RateConversionService();
		rateConversionService.setRateProvider(crp);
		return rateConversionService;
	}

}

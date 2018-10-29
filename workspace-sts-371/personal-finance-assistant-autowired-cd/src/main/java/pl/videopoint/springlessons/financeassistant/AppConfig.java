package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FileCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FixedPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
import pl.videopoint.springlessons.financeassistant.services.RoundPrecisionProvider;

@Configuration
public class AppConfig {
	
	@Bean
	public CurrencyRateProvider fileCurrencyRateProvider() {
		return new FileCurrencyRateProvider();
	}
	
	@Bean
	public RateConversionService rateConvesionService() {// autowired 2 uzuwamy setter w opisie konstrukcji i usuwamy  parametr metody, wymagana modyfikacja servisu
		RateConversionService rateConversionService = new RateConversionService();
			return rateConversionService;
	}
	
	@Bean
	public RoundPrecisionProvider roundPrecisionProvider(){
		
		return new FixedPrecisionProvider();
	}

}

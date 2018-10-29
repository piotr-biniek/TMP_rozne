 package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.DatabaseCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FileCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FixedPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.JpyPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
import pl.videopoint.springlessons.financeassistant.services.RoundPrecisionProvider;

@Configuration
@Profile({"dev"})
//@Profile("dev")//mozna umiescic tutaj gdyż też pozwala na rózne całe konfiguracje dla różnych werski
//@ComponentScan(basePackages={"pl.videopoint.springlessons.financeassistant.services"})

public class AppConfigDev {
	
//	@Bean
//	@Profile("dev")// moze byc tbica profili
//	//@Primary
//	public CurrencyRateProvider fileCurrencyRateProvider() {
//		return new FileCurrencyRateProvider();
//	}
	
	@Bean
	@Primary
		public CurrencyRateProvider databaseCurrencyRateProvider() {
		return new DatabaseCurrencyRateProvider();
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
	
	@Bean//(name={"DupnyPrecProvider","secondPprecProw"})// nazwa guwna i aliasy!!
	public RoundPrecisionProvider roundJpyPrecisionProvider(){
		
		return new JpyPrecisionProvider();
	}
}

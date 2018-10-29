 package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FileCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FixedPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.JpyPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
import pl.videopoint.springlessons.financeassistant.services.RoundPrecisionProvider;

@Configuration
//@ComponentScan(basePackages={"pl.videopoint.springlessons.financeassistant.services"},
////excludeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes=CurrencyRateProvider.class))// wyłaczenie określonych klas
//excludeFilters={@Filter(type=FilterType.ASSIGNABLE_TYPE,classes=CurrencyRateProvider.class),
//		@Filter(type=FilterType.REGEX,pattern=".*Service")})//exkludowany okreslony i paliet i plik lub paliet z nazwą service
////regex działa też na pakietach!!


@ComponentScan(
		basePackages={"pl.videopoint.springlessons.financeassistant.services"}	//skanowanie pakietu konkretnego
,includeFilters=@Filter(type=FilterType.ASSIGNABLE_TYPE,classes=CurrencyRateProvider.class)	//usuwamy service z tej klasy żeby automatyczny skaner komponentów tego nie dołączył
, useDefaultFilters=false 	//wyłączenie automatycznego skanowania z wiersza 1-go
		)

//		@Filter(type=FilterType.REGEX,pattern=".*Service")})//exkludowany okreslony i paliet i plik lub paliet z nazwą service
//regex działa też na pakietach!!

public class AppConfig {
	
//	@Bean
//	public CurrencyRateProvider fileCurrencyRateProvider() {
//		return new FileCurrencyRateProvider();
//	}
//	
//	@Bean
//	public RateConversionService rateConvesionService() {// autowired 2 uzuwamy setter w opisie konstrukcji i usuwamy  parametr metody, wymagana modyfikacja servisu
//		RateConversionService rateConversionService = new RateConversionService();
//			return rateConversionService;
//	}
//	
//	@Bean
//	public RoundPrecisionProvider roundPrecisionProvider(){
//		
//		return new FixedPrecisionProvider();
//	}
//	
//	@Bean
//	public RoundPrecisionProvider roundJpyPrecisionProvider(){
//		
//		return new JpyPrecisionProvider();
//	}
}

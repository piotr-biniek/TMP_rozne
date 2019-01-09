package pl.biniek.financeasistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

import pl.biniek.financeasistant.services.CurrencyRateProvider;
import pl.biniek.financeasistant.services.FileCurrencyRateProvider;
import pl.biniek.financeasistant.services.RateConversionService;
import pl.biniek.financeasistant.services.RoundPrecisionProvider;
import pl.biniek.financeasistant.services.FixedPrecisionProvider;
import pl.biniek.financeasistant.services.JpyPrecisionProvider;

@Configuration
@ComponentScan(basePackages={"pl.biniek.financeasistant.services"},//autoskan v6 reszte komentujemy!!
excludeFilters={@Filter(type=FilterType.ASSIGNABLE_TYPE, classes=CurrencyRateProvider.class),// v6 wykluczamy jakas klase
@Filter(type=FilterType.REGEX,pattern=".*Service")})//, też includeFilters i jka dalej)
public class AppConfig {
	
	@Bean// v6 musimy dodoac bo wykluczylismy z autoskanowania wied recznie inaczej wyjatek
	public CurrencyRateProvider fileCurrencyRateProvider() {
		return new FileCurrencyRateProvider();
	}
	
	@Bean//v6 dodajemy recznie wykluczenie z filtra regex
	public RateConversionService rateConvesionService() {//v3 pierwszy autowired 
	//public RateConversionService rateConvesionService(CurrencyRateProvider crp) {//v2 pierwszy autowired bez autowired :) podajemy interfejs
	//public RateConversionService rateConvesionService(){ //v1 z pokazaniem co sie dzieje
		RateConversionService rateConversionService = new RateConversionService();
		//rateConversionService.setRateProvider(fileCurrencyRateProvider()); //v 1 z pokazaniem co sie dzieje
	//	rateConversionService.setRateProvider(crp); v2 v2 pierwszy autowired bez autowired :) podajemy interfejs 

		return rateConversionService;
	}
//@Bean
//public RoundPrecisionProvider roundPrecisionProvider(){//v5 podajemyroundprecisionprovidera
//	return new FixedPrecisionProvider();
//}
//	
//	
//@Bean
//public RoundPrecisionProvider roundJpyPrecisionProvider(){//v6 kolekcja providerow
//	
//	return new JpyPrecisionProvider();
//}
}




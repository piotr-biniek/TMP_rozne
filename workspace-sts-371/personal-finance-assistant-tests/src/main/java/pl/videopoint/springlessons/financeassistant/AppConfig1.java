package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FileCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
//import pl.videopoint.springlessons.financeassistant.services.SecondRateConversionService;

@Configuration// oznaczenie ze to konfiguracja do tworzenia beanow
public class AppConfig1 {
	@Bean// oznaczamy ze so to beany zamiast w klasie to w configu
	@Scope("prototype")
	public CurrencyRateProvider fileCurrencyRateProvider(){
		return new FileCurrencyRateProvider();
	}
	@Bean// do prostrszego autovired 1
	public RateConversionService rateConversionServiceOld2(CurrencyRateProvider currencyRateProvider){
	RateConversionService rateConversionService = new RateConversionService();
	rateConversionService.setRateProvider(currencyRateProvider);
	return rateConversionService;
	
	}


//domyslnie to singleton

//public RateConversionService rateConversionServiceOld1(){
//	RateConversionService rateConversionService = new RateConversionService();
//	rateConversionService.setRateProviderOld(fileCurrencyRateProvider());
//	return rateConversionService;
//	
//}


	//@Bean// pokazujemy zalenosci miedzu klasami zamiast injectow to tu pokazujemy co jak zaley i se buduje
	//public RateConversionService rateConversionService(){// działa z autowired
//		RateConversionService rateConversionService = new RateConversionService();
//		return rateConversionService;
	//	
	//}
	
//@Bean
//public SecondRateConversionService secondRrateConversionService(){
//	SecondRateConversionService secondRateConversionService = new SecondRateConversionService();
//	secondRateConversionService.setRateProvider(fileCurrencyRateProvider());
//	return secondRateConversionService;
//	
//}	
	
}

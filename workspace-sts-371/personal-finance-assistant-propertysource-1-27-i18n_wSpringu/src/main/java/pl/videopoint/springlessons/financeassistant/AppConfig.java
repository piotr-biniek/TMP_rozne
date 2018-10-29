package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.context.support.ResourceBundleMessageSource;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.DatabaseCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FileCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FixedPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.JpyPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
import pl.videopoint.springlessons.financeassistant.services.RoundPrecisionProvider;

@Configuration
@PropertySource(ignoreResourceNotFound = true, value = { "classpath:app.properties", "file:/${configLoc}/jakisplik.properties" }) 
// to g z dolarem to do niego robimy beana na dole i ponem konfigutujemy argumenty uruchomienia run Configurations!! 
// jako -DPropertySourcesPlaceholderConfigurer tak jak nazwa klasy
//potem runas!!
// też mozna tablice -
//2 plik jest ważniejszy!!
// ignoreResourceNotFound=true pozwala ignorowac nnie znalezione pliki
// @Profile({"prod","dev"})
// @Profile("dev")//mozna umiescic tutaj gdyż też pozwala na rózne całe
// konfiguracje dla różnych werski
// @ComponentScan(basePackages={"pl.videopoint.springlessons.financeassistant.services"})

public class AppConfig {

	

	@Bean
	public ResourceBundleMessageSource messageSource(){
		ResourceBundleMessageSource source = new  ResourceBundleMessageSource();
		source.setBasename("i18n/messages");
		return source;//source;
	}

	
	@Bean
	@Primary
	public CurrencyRateProvider fileCurrencyRateProvider() {
		return new FileCurrencyRateProvider();
	}

	
	
	
	@Bean

	public CurrencyRateProvider databaseCurrencyRateProvider() {
		return new DatabaseCurrencyRateProvider();
	}

	@Bean
	public RateConversionService rateConvesionService() {// autowired 2 uzuwamy
															// setter w opisie
															// konstrukcji i
															// usuwamy parametr
															// metody, wymagana
															// modyfikacja
															// servisu
		RateConversionService rateConversionService = new RateConversionService();
		return rateConversionService;
	}

	@Bean
	public RoundPrecisionProvider roundPrecisionProvider() {

		return new FixedPrecisionProvider();
	}

	@Bean // (name={"DupnyPrecProvider","secondPprecProw"})// nazwa guwna i
			// aliasy!!
	public RoundPrecisionProvider roundJpyPrecisionProvider() {

		return new JpyPrecisionProvider();
	}

	@Bean// potrzebne do zmiennej srodowiskowej okreslonej z ${costam w srodku}
	public static PropertySourcesPlaceholderConfigurer placeholderConfig() {
		return new PropertySourcesPlaceholderConfigurer();
	}

}

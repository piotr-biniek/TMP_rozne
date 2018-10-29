package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.DatabaseCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FixedPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.JpyPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
import pl.videopoint.springlessons.financeassistant.services.RoundPrecisionProvider;

@Configuration
@ImportResource("classpath:appconfig.xml")// dodanie konfigu beana  w xml!!!!
public class AppConfigCommon {// dodajemy @Import(AppConfigCommon.class) w pozosrałych plikach
	//dzieki temu mamy ty;ko róznice w pozostałych plikach config
	//mozna tez dodac konfig w xml

//	@Bean
//	public RateConversionService rateConvesionService() {
//		RateConversionService rateConversionService = new RateConversionService();
//		return rateConversionService;
//	}

	@Bean
	public RoundPrecisionProvider roundPrecisionProvider() {
		return new FixedPrecisionProvider();
	}

	@Bean(name={"anotherPrecisionProvider","secondPrecisionProvider"})
	public RoundPrecisionProvider roundJpyPrecisionProvider() {
		return new JpyPrecisionProvider();
	}
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}


}

// przy dodawaniu lig4j potrzeba dodoać most slf4j do log4j, wylaczyc springowe logowanie, kilka wpisów w pom.xml
// utworzyc konfig log4j s pliku xml
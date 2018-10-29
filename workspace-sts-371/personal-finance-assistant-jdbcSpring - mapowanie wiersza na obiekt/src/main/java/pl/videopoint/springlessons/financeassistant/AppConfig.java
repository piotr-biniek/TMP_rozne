package pl.videopoint.springlessons.financeassistant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import pl.videopoint.springlessons.financeassistant.services.CurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.DatabaseCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FileCurrencyRateProvider;
import pl.videopoint.springlessons.financeassistant.services.FixedPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.JpyPrecisionProvider;
import pl.videopoint.springlessons.financeassistant.services.RateConversionService;
import pl.videopoint.springlessons.financeassistant.services.RoundPrecisionProvider;

@Configuration
@Import(AppConfigCommon.class)
@Profile({"dev","!prod"})
@PropertySource(ignoreResourceNotFound=true,
	value={"classpath:app.properties","file:/${configLoc}app2.properties"})
public class AppConfig {

	@Bean
	public CurrencyRateProvider fileCurrencyRateProvider() {
		return new FileCurrencyRateProvider();
	}

	// przy dodawaniu lig4j potrzeba dodoać most slf4j do log4j, wylaczyc springowe logowanie, kilka wpisów w pom.xml
	// utworzyc konfig log4j s pliku xml

}

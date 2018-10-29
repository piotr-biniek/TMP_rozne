package pl.videopoint.springlessons.financeassistant;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pl.videopoint.springlessons.financeassistant.dao.CurrencyRateDao;
import pl.videopoint.springlessons.financeassistant.dao.JdbcCurrencyRateDao;

@Configuration
public class DataBaseConfig {
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("org.h2.Driver");
		source.setUrl("jdbc:h2:~/springtutorial;INIT=runscript from 'classpath:/create.sql'");
		source.setUsername("SA");
		return source;
	}
	
	@Bean
	public CurrencyRateDao currencyRateDao() {
		return new JdbcCurrencyRateDao();
	}

}
	
//	@Bean
//	public DataSource dataSource(){
//		BasicDataSource source = new BasicDataSource();
//		source.setDriverClassName("org.h2.Driver");// ustawienie driwera dla bacy danych - sterownika znaczy
//		source.setUrl("jdbc:h2:~/springtutorial;INIT=runscript from 'classpath:/create.sql'");
//		source.setUsername("SA");
//		// jdbc:h2:~/nazwaPlikuGdzieBedzieBaza; inicjalizacja skryprem SQLowym!!!!
//		
//		return source;
//		
//		
//	}
//	
//	@Bean
//	public CurrencyRateDao currencyRateDao(){
//		return new JdbcCurrencyRateDao();
//	}
//	
//	
//
//}

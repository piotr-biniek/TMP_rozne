package pl.videopoint.springlessons.financeassistant.services;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Service
@Primary
public class DatabaseCurrencyRateProvider implements CurrencyRateProvider {
	
	public BigDecimal getRate(String currency, Date rateDate) {
		System.out.println("FileCurrencyRateProvider: Wczytano kursy z BAZY DANYCH");
		return BigDecimal.valueOf(4.25);
	}

}

package pl.videopoint.springlessons.financeassistant.services;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import pl.videopoint.springlessons.financeassistant.dao.CurrencyRateDao;
import pl.videopoint.springlessons.financeassistant.dto.CurrencyRate;

@Service
public class DatabaseCurrencyRateProvider implements CurrencyRateProvider {
	
	@Autowired
	private CurrencyRateDao currencyRateDao;
	
	public BigDecimal getRate(String currency, Date rateDate) {
		BigDecimal rate = currencyRateDao.getRate(currency, rateDate);
		CurrencyRate currencyRate=currencyRateDao.getRateInfo(currency, rateDate);
		
		System.out.println("currency rate "+currencyRate);
		
		
		System.out.println("DatabaseCurrencyRateProvider: Wczytano kursy z bazy danych kurs="+rate);
		return rate;
	}
	
//	public CurrencyRate getCurrency(String currency, Date rateDate) {
//		BigDecimal rate = currencyRateDao.getRate(currency, rateDate);
//		System.out.println("DatabaseCurrencyRateProvider: Wczytano kursy z bazy danych kurs="+rate);
//		return rate;
//	}
	
	

}

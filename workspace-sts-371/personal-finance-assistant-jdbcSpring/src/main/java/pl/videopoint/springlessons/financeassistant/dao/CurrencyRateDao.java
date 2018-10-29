package pl.videopoint.springlessons.financeassistant.dao;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import pl.videopoint.springlessons.financeassistant.dto.CurrencyRate;

public interface CurrencyRateDao {

	BigDecimal getRate(String currency, Date rateDate);
	
	CurrencyRate getRateInfo(String currency, Date rateDate);
	
	public void addRate(CurrencyRate currencyRate);
	
	public void addManyRates(List<CurrencyRate> rates );
	
	
	
	
	
	
}

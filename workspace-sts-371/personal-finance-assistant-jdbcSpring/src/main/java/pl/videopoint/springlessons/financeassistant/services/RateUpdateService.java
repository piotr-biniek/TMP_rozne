package pl.videopoint.springlessons.financeassistant.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
//import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;

import pl.videopoint.springlessons.financeassistant.dao.CurrencyRateDao;
import pl.videopoint.springlessons.financeassistant.dto.CurrencyRate;
@Service//my service 

public class RateUpdateService {//

	@Autowired
	CurrencyRateDao currencyRateDao;
	
	

	public void storeRate(CurrencyRate currencyRate){
		currencyRateDao.addRate(currencyRate);
		
	}
	
	public void storeManyRates(List<CurrencyRate> listOfRates){
		currencyRateDao.addManyRates(listOfRates);
		
	}
	
	
}

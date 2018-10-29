package pl.videopoint.springlessons.financeassistant.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.Set;
//import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

public class RateConversionService {

	
	@Autowired
	private CurrencyRateProvider rateProvider;
	private Set<String> supportedCurr;
	
		
	public void setSupportedCurr(Set<String> supportedCurr) {
		this.supportedCurr = supportedCurr;
	}
//@Autowired albo przy seterze albo przy polu!!!
	public void setRateProvider(CurrencyRateProvider rateProvider){
		this.rateProvider = rateProvider;
	}

	public BigDecimal convertAmount(BigDecimal amount, String currency) {
		BigDecimal rate = rateProvider.getRate(currency, new Date());
		if(supportedCurr.contains(currency)){
			System.out.println("Waluta w zbiorze walut "+currency);	
		}
		System.out.println("RateConversionService: Obliczam kwote");
		BigDecimal result = amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
		return result;
	}

}

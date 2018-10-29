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
@Service//my service 

public class RateConversionService {//

	private CurrencyRateProvider rateProvider;
	
	
	@Autowired
	public void setRateProvider(CurrencyRateProvider rateProvider){//my rate conv serv
		this.rateProvider = rateProvider;
	}
	
	@Autowired(required = false)
	@Qualifier("secondPrecisionProvider")
	private Map<String, RoundPrecisionProvider> precisionProviders;

	public BigDecimal convertAmount(BigDecimal amount, String currency)throws  java.text.ParseException {
		
		Date data = (new SimpleDateFormat("yyyy-mm-dd")).parse("2016-01-24");

		
		
		
		BigDecimal rate = rateProvider.getRate(currency, data);
		System.out.println("RateConversionService: Obliczam kwote");
		int precision = 2;
		System.out.println("Ilosc dostawc�w: "+precisionProviders.size());
		for (String providerName : precisionProviders.keySet()) {
			RoundPrecisionProvider provider = precisionProviders.get(providerName);
			System.out.println("Bean: "+providerName);
			if (provider.isSupported("PLN")) {
				precision = provider.getRoundPrecision("PLN");
			}
		}
		BigDecimal result = amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
		return result;
	}

}

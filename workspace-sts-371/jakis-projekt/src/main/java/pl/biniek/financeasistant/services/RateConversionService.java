package pl.biniek.financeasistant.services;

import java.lang.annotation.Inherited;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateConversionService {

	private CurrencyRateProvider rateProvider;

	@Autowired // v3 autowired
	public void setRateProvider(CurrencyRateProvider rateProvider) {
		this.rateProvider = rateProvider;
	}

	@Autowired(required = false) // v4
	private List<RoundPrecisionProvider> precisionProviders;//lista providerow

	public BigDecimal convertAmount(BigDecimal amount, String currency) {
		BigDecimal rate = rateProvider.getRate(currency, new Date());
		System.out.println("RateConversionService: Obliczam kwote");

		int precision = 2;
		System.out.println("liczba providerow: "+precisionProviders.size());
		
		for (RoundPrecisionProvider provider : precisionProviders) {
			if (provider.isSupportedCurrency("PLN")){
				precision=provider.getRoundPrecisionProvider("PLN");
				System.out.println();
			}
			
		}
//		if (precisionProvider != null) { //do V4 wlacznie
//			precision = precisionProvider.getRoundPrecisionProvider("PLN");
//		} else {
//			System.out.println("brak providera");
//		}

		BigDecimal result = amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
		return result;
	}

}

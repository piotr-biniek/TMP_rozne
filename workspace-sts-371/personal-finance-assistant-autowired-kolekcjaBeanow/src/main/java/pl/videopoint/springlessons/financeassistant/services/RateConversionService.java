package pl.videopoint.springlessons.financeassistant.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class RateConversionService {
	@Autowired
	private CurrencyRateProvider rateProvider;

	@Autowired(required = false)
	private List<RoundPrecisionProvider> precisionProviders;

	// tu podajemy gdzie dowiązujemy beana!! tak ma ponoć być ale mozna też
	// wyżej jak w JEE!!!!
	public void setRateProvider(CurrencyRateProvider rateProvider) {
		this.rateProvider = rateProvider;
	}

	public BigDecimal convertAmount(BigDecimal amount, String currency) {
		BigDecimal rate = rateProvider.getRate(currency, new Date());
		// System.out.println("Autowired CD!!");
		System.out.println("RateConversionService: Obliczam kwote");
		int precision = 2;
		System.out.println("ilosc dostwcow -" + precisionProviders.size());

		for (RoundPrecisionProvider provider : precisionProviders) {

			if (provider.isSuported("PLN")) {
				precision = provider.getRoundPrecision("PLN");

			}
		}
		BigDecimal result = amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
		return result;
	}

}

package pl.videopoint.springlessons.financeassistant.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;
//import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service // tu podajemy nazwe komponentu jeeli automatyczne skanowanie - i chcemy gdzie indziej po nazwach go apa
public class RateConversionService {
	@Autowired
	private CurrencyRateProvider rateProvider;

	@Autowired(required = false)
	@Qualifier("secondPprecProw")//podanie nazwy beana!! albo aliasu
	private Map<String, RoundPrecisionProvider> precisionProviders;

	public void setRateProvider(CurrencyRateProvider rateProvider) {
		this.rateProvider = rateProvider;
	}

	public BigDecimal convertAmount(BigDecimal amount, String currency) {
		BigDecimal rate = rateProvider.getRate(currency, new Date());
	
		System.out.println("RateConversionService: Obliczam kwote");
		int precision = 2;
		System.out.println("ilosc dostwcow -" + precisionProviders.size());

		for (String providerName : precisionProviders.keySet()) {
		RoundPrecisionProvider provider = precisionProviders.get(providerName);
		System.out.println("Bean provider: "+providerName);
			if (provider.isSuported("PLN")) {
				precision = provider.getRoundPrecision("PLN");

			}
		}
		BigDecimal result = amount.multiply(rate).setScale(2, RoundingMode.HALF_UP);
		return result;
	}

}

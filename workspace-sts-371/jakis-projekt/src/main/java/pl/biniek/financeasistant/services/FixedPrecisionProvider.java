package pl.biniek.financeasistant.services;

import org.springframework.stereotype.Service;

@Service
public class FixedPrecisionProvider implements RoundPrecisionProvider{

	public int getRoundPrecisionProvider(String currency) {
		
		return 2;
	}

	public boolean isSupportedCurrency(String currency) {
		// TODO Auto-generated method stub
		return "PLN".equals(currency);
	}
	

}

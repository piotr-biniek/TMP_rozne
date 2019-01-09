package pl.biniek.financeasistant.services;

import org.springframework.stereotype.Service;

@Service
public class JpyPrecisionProvider implements RoundPrecisionProvider {

	public int getRoundPrecisionProvider(String currency) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isSupportedCurrency(String currency) {
		// TODO Auto-generated method stub
		return "JPY".equals(currency);
	}
	}



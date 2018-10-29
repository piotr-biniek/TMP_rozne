package pl.videopoint.springlessons.financeassistant.services;

import org.springframework.stereotype.Service;

@Service
public class FixedPrecisionProvider implements RoundPrecisionProvider {

	public int getRoundPrecision(String currency) {
		// TODO Auto-generated method stub
		return 2;
	}
	public boolean isSuported(String currency) {
		// TODO Auto-generated method stub
		return "PLN".equals(currency);
	}

}

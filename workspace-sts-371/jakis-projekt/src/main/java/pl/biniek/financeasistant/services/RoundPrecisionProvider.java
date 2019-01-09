package pl.biniek.financeasistant.services;

import org.springframework.stereotype.Service;


public interface RoundPrecisionProvider {
	int getRoundPrecisionProvider( String currency);
	boolean isSupportedCurrency(String currency);
	
	

}

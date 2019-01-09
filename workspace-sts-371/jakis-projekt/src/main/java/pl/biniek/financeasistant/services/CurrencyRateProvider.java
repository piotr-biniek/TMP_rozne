package pl.biniek.financeasistant.services;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.stereotype.Service;


public interface CurrencyRateProvider {
	BigDecimal getRate(String currency, Date rateDate);
}

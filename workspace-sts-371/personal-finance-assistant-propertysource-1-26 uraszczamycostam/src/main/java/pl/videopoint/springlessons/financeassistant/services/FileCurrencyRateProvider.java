package pl.videopoint.springlessons.financeassistant.services;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class FileCurrencyRateProvider implements CurrencyRateProvider {
//	@Autowired 
//	private Environment env;// zamiast injecta i okreslania pliku w metodzie pod *
	
	
	@Value(value = "${filename:domyslny.xml}")//tu podajemy jaka wartosc ma byc przypisana zmiennej fileName moze buc wartosc konkretna albo srodowiskowa
	//moze byc tez wartosc domyslna po :
	private String fileName;
	
	public BigDecimal getRate(String currency, Date rateDate) {
//*//		String fileName = env.getProperty("filename");// jako parament uruchomienia -Dfilename=plik //*
		System.out.println("FileCurrencyRateProvider: Wczytano kursy z pliku lokalnego "+fileName);
		return BigDecimal.valueOf(4.25);
	}

}



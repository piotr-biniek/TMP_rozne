package pl.videopoint.springlessons.financeassistant.services;

import java.beans.ConstructorProperties;
import java.math.BigDecimal;
import java.util.Date;

public class FileCurrencyRateProvider implements CurrencyRateProvider {
	
	private String fileName;
	
	
	private int maxCnt;
	
	
	
	
	
	
	
	@ConstructorProperties({"fileName", "maxCnt"})// konstruktor do xmla przekazywan - działa też bez tego!!ale po kompilacji moga sie zgubic nazwy
	public FileCurrencyRateProvider(String fileName, int maxCnt) {
		super();
		this.fileName = fileName;
		this.maxCnt = maxCnt;
	}


//
//
//	public void setFileName(String fileName) {
//		this.fileName = fileName;
//	}




	public BigDecimal getRate(String currency, Date rateDate) {

			
		System.out.println("Bean: " + this.hashCode());
		System.out.println("FileCurrencyRateProvider: Wczytano kursy z pliku lokalnego "+fileName);
		return BigDecimal.valueOf(4.25);
	}

}

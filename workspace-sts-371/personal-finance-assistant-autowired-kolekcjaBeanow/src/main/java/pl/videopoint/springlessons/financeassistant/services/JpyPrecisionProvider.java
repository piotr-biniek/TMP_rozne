package pl.videopoint.springlessons.financeassistant.services;

public class JpyPrecisionProvider implements RoundPrecisionProvider {

	public int getRoundPrecision(String currency) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isSuported(String currency) {
		// TODO Auto-generated method stub
		return "JPY".equals(currency);
	}

}

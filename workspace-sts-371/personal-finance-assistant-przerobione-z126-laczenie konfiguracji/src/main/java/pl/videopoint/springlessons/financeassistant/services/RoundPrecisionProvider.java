package pl.videopoint.springlessons.financeassistant.services;

public interface RoundPrecisionProvider {
	int getRoundPrecision(String currency);
	boolean isSupported(String currency);
}

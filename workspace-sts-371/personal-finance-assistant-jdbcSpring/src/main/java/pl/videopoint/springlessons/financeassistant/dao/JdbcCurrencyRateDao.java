package pl.videopoint.springlessons.financeassistant.dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import pl.videopoint.springlessons.financeassistant.dto.CurrencyRate;

//@Repository// oznacza specjalny komponent sprong z dostepem do danych
@Repository
public class JdbcCurrencyRateDao implements CurrencyRateDao {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	// public BigDecimal getRate(String currency, Date rateDate) {
	// return jdbcTemplate.queryForObject("select rate from currency_rates where
	// currency=? and rate_date =?",
	// new Object []{currency, new java.sql.Date(rateDate.getTime())},
	// BigDecimal.class);
	//
	//
	//
	// // TODO Auto-generated method stub
	// // return null;
	// }
	public BigDecimal getRate(String currency, Date rateDate) {
		return jdbcTemplate.queryForObject("select rate from currency_rates where currency=? and rate_date = ?",
				new Object[] { currency, new java.sql.Date(rateDate.getTime()) }, BigDecimal.class);
		// zamiast konkredtej klasy możemy podac każdy obiekt implemetujący row
		// mapper i tworzyc nasz obiekt np currency BigDecimal.class
	}

	public CurrencyRate getRateInfo(String currency, Date rateDate) {
		return jdbcTemplate.queryForObject("select * from currency_rates where currency=? and rate_date = ?",
				new Object[] { currency, new java.sql.Date(rateDate.getTime()) }, new RowMapper<CurrencyRate>() {

					public CurrencyRate mapRow(ResultSet rs, int rowNum) throws SQLException {
						return new CurrencyRate(rs.getNString("CURRENCY"), rs.getDate("RATE_DATE"),
								rs.getBigDecimal("RATE"));

					}

				});
		 // zamiast konkredtej klasy możemy podac każdy obiekt implemetujący row
		// mapper i tworzyc nasz obiekt np currency BigDecimal.class

	}

	public void addRate(CurrencyRate currencyRate) {
		jdbcTemplate.update("INSERT INTO CURRENCY_RATES (CURRENCY, RATE_DATE, RATE) VALUES(?,?,?)"
				, currencyRate.getCurrency(),new java.sql.Date(currencyRate.getData().getTime()), currencyRate.getRate());
		
	}

	public void addManyRates(final List<CurrencyRate> currencyRates) {// final ze względu na klasę anonimową
	
		
		List <Object[]> batch= new ArrayList<Object[]>();
				

				
		jdbcTemplate.batchUpdate("INSERT INTO CURRENCY_RATES (CURRENCY, RATE_DATE, RATE) VALUES(?,?,?)", new BatchPreparedStatementSetter() {
			
			public void setValues(PreparedStatement ps, int i) throws SQLException {
				ps.setString(1, currencyRates.get(i).getCurrency());
				ps.setDate(2, new java.sql.Date(currencyRates.get(i).getData().getTime()));
				ps.setBigDecimal(3,  currencyRates.get(i).getRate());
				
			}
			
			public int getBatchSize() {
				
				return currencyRates.size();
			}
		} );
		
	}
	
public void addManyRates2(List<CurrencyRate> currencyRate) {
	
		
		List <Object[]> batch= new ArrayList<Object[]>();
		
		
		for ( CurrencyRate rate : currencyRate) {
			batch.add(new Object[]{rate.getCurrency(),new java.sql.Date(rate.getData().getTime()), rate.getRate()});
					
		}
				
		jdbcTemplate.batchUpdate("INSERT INTO CURRENCY_RATES (CURRENCY, RATE_DATE, RATE) VALUES(?,?,?)", batch);
		
	}
	
	

}

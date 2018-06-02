package com.example.cryptot.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Currency;
import java.util.Locale;
import java.util.Date;

/**
 * Coin
 */
public class Coin {
  private  Map<Currency, Date> priceByTime = new HashMap<Currency, Date>();

/**
 * @return the priceByTime
 */
public Map<Currency, Date> getPriceByTime() {
	return priceByTime;
}

/**
 * @param priceByTime the priceByTime to set
 */
public void setPriceByTime(Map<Currency, Date> priceByTime) {
	this.priceByTime = priceByTime;
}

    
}
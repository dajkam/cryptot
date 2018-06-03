package com.example.cryptot.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.net.MalformedURLException;

import java.util.Locale;
import java.util.Date;
import java.math.BigDecimal;

/**
 * Coin
 */
public class Coin {
  private  Map<Date, BigDecimal> priceByTime = new HashMap<Date,BigDecimal>();
  
  public  Coin(Map<Date, BigDecimal> priceByTime) throws JsonParseException, JsonMappingException, MalformedURLException, IOException {
	this.priceByTime = priceByTime;
	
}







/**
 * @return the priceByTime
 */
public Map<Date, BigDecimal> getPriceByTime() {
	return priceByTime;
}

/**
 * @param priceByTime the priceByTime to set
 */
public void setPriceByTime(Map<Date,BigDecimal> priceByTime) {
	this.priceByTime = priceByTime;
}

    
}
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
 * BTC
 */
public class BTC extends Coin {

    public static final String Name = "BTC";

    public BTC(HashMap<Date,BigDecimal> priceByTime) throws JsonParseException, JsonMappingException, MalformedURLException, IOException{
        super( priceByTime);
    }
    
}
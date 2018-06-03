package com.example.cryptot.model;


import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import java.io.IOException;
import java.net.MalformedURLException;

import java.util.Locale;
import java.util.Date;

/**
 * LTC
 */
public class LTC extends Coin {
    public static final String Name = "LTC";

    public LTC(HashMap<Date,BigDecimal> priceByTime) throws JsonParseException, JsonMappingException, MalformedURLException, IOException{
        super( priceByTime);
    }

    
}
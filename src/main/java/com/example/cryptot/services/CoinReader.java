

package com.example.cryptot.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.math.BigDecimal;

import javax.print.DocFlavor.STRING;

import  com.example.cryptot.model.*;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * CoinReader
 */
public class CoinReader implements ItemReader<Coin> {

    private String apiUrl = "https://apiv2.bitcoinaverage.com/indices/global/history/BTCUSD?period=daily&?format=json";
   public  Map<Date,BigDecimal> priceByTime;
    private RestTemplate rtemplate;

    public CoinReader() 
    {
        this.apiUrl = apiUrl;
       // this.rtemplate = rTemplate;
        this.priceByTime = new HashMap<>();
    }


    public Map <Date,BigDecimal> takeDataFromApi() throws JsonParseException, JsonMappingException, MalformedURLException, IOException{

       

        HashMap<Date,BigDecimal> priceByTime =
         new ObjectMapper().readValue(new URL(apiUrl), HashMap.class);
       
       
       
       
        return priceByTime;
    }


	@Override
	public Coin read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        
        
        return null;
	}

    
}
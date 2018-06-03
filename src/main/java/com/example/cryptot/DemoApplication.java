package com.example.cryptot;

import java.io.IOException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import com.example.cryptot.model.Coin;
import com.example.cryptot.services.CoinReader;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;


import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

@Controller
@SpringBootApplication
public class DemoApplication {

    @RequestMapping("/")
    @ResponseBody
    String home() {
      return "działa";
    }

    public Coin setup() throws JsonMappingException, MalformedURLException, IOException, java.text.ParseException {


        CoinReader cr = new CoinReader();

   

     

    try {
        Coin coin = new Coin(cr.takeDataFromApi());
        return coin;
        
    } 
    catch( JsonParseException e){
        e.printStackTrace();
    }

    Map <Date,java.math.BigDecimal> nullmap = new HashMap<Date,java.math.BigDecimal>();

    String strdate = "01-01-1995 11:11:11";
    SimpleDateFormat dateformat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
    Date newdate = dateformat.parse(strdate);
    BigDecimal c = new BigDecimal(111.11);

    nullmap.put(newdate,c );

    Coin nullCoin = new Coin(nullmap);
	return nullCoin;
      
    }
    
    
    

    @RequestMapping("/coin")
    @ResponseBody
    String home2() {
      return "działa";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
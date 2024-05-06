package com.in28minutes.microservices.currencyconversionservice.proxy;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.in28minutes.microservices.currencyconversionservice.controller.beans.CurrencyConversion;
//import com.in28minutes.microservices.currencyexchangeservice.controller.beans.CurrencyExchange;

@FeignClient(name = "currency-exchange")
public interface CurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion getCurrency(@PathVariable String from, @PathVariable String to);

}

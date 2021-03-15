package com.jcastillo.exchanger.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExchangeNotFoundAdvise {
	@ResponseBody
	@ExceptionHandler(ExchangeNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	  String ExchangeNotFoundHandler(ExchangeNotFoundException ex) {
	    return ex.getMessage();
	  }
		
}

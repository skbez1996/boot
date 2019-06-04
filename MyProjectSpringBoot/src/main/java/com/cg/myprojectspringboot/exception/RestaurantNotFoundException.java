package com.cg.myprojectspringboot.exception;

/**
 *  * @author saibezaw
 *  this is Exception class 
 */ 
public class RestaurantNotFoundException extends Exception{

	public RestaurantNotFoundException() {
		
		super();
	
	}

	public RestaurantNotFoundException(String msg) {
		
		super(msg);
		
	}
}

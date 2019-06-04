package com.cg.myprojectspringboot.controller;


import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.myprojectspringboot.dto.Restaurant;
import com.cg.myprojectspringboot.service.MenuService;

@RestController
@RequestMapping("/restaurant")
public class MenuController { 
	@Autowired
	MenuService menuservice;
	public static final Logger logger = Logger.getLogger(MenuController.class); 

/**
 *  * @author saibezaw
 * method name: addRestaurant
 * param:- rest (Restaurant)
 * returns :- rest(Restaurant)
 *
 */ 
 

 @RequestMapping(value="/add",method=RequestMethod.POST)
public ResponseEntity<Restaurant> addRestaurantt(@ModelAttribute Restaurant restaurant) {
	Restaurant rest= menuservice.add(restaurant);
	
	if(rest == null) {
		return new ResponseEntity("No Restaurant added",HttpStatus.NOT_FOUND);
	}
	  return new ResponseEntity<Restaurant>(rest,HttpStatus.OK);
 }
	 //System.out.println(res);
	//menuservice.addRestaurant(res);
	
/*	return res;

}*/

/**
 *  * @author saibezaw
 * method name: SearchRestaurant
 * param:- rest (Restaurant)
 * returns :- rest(Restaurant)
 *
 */ 
 
 @RequestMapping(value="/searchby",method=RequestMethod.GET)
 public ResponseEntity<List<Restaurant>> search(@RequestParam("rname") String name){
{
	List<Restaurant> restaurantList=menuservice.findByName(name);
	if(restaurantList.isEmpty()) {
		return new ResponseEntity("Np restaurant to show",HttpStatus.NOT_FOUND);
	}
	return new ResponseEntity<List<Restaurant>>(restaurantList,HttpStatus.OK);
}
 }


/**
 *  * @author saibezaw
 * method name: showRestaurant
 * param:- rest (Restaurant)
 * returns :- rest(Restaurant)
 *
 */ 
 
@RequestMapping(value="/show",method=RequestMethod.GET)
public ResponseEntity<List<Restaurant>> showAll(){
{ 
	List<Restaurant> restaurantList=menuservice.showRestaurant();
	if(restaurantList.isEmpty()) {
		return new ResponseEntity("Np restaurant to show",HttpStatus.NOT_FOUND);
	}
	return new ResponseEntity<List<Restaurant>>(restaurantList,HttpStatus.OK);
}	
}
}
	//return  menuservice.showAll();
	 
 
	 
	


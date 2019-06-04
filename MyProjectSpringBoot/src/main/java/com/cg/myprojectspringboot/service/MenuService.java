package com.cg.myprojectspringboot.service;

import java.util.List;

import com.cg.myprojectspringboot.dto.Restaurant;



/**
 *  * @author saibezaw
services
 * returns :- rest(Restaurant)
 *
 */ 

public interface MenuService {
	/*public Restaurant addRestaurant(Restaurant res);
	public List<Restaurant> showAll();*/
	public Restaurant add(Restaurant restaurant) ;
	public List<Restaurant> findByName(String name);
	public List<Restaurant> showRestaurant();
}
   
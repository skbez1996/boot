package com.cg.myprojectspringboot.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.myprojectspringboot.dto.Restaurant;




/**
 *  * @author saibezaw
 * method name: showRestaurant
 * param:- rest (Restaurant)
 * returns :- rest(Restaurant)
 *
 */ 


public interface MenuDao extends JpaRepository<Restaurant,Integer >  {
	
	public List<Restaurant> findByName(String name); 
	
	
	//public List<Restaurant> showAll();

}



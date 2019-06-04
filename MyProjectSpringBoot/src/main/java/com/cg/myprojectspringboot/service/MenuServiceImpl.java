package  com.cg.myprojectspringboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.myprojectspringboot.controller.MenuController;
import com.cg.myprojectspringboot.dao.MenuDao;
import com.cg.myprojectspringboot.dto.Restaurant;

@Service
public class MenuServiceImpl implements MenuService{
	@Autowired
	MenuDao menudao;

/**
 *  * @author saibezaw
 * method name: addRestaurant
 * param:- rest (Restaurant)
 * returns :- rest(Restaurant)
 *
 */ 
	@Override
	public Restaurant add(Restaurant restaurant) {
		if(MenuController.logger.isDebugEnabled()){
			MenuController.logger.debug("addRestaurant addRestaurant(Restaurant) is executed!");
			MenuController.logger.debug(" adds the Restaurant object");
		} 
		return menudao.save(restaurant);
	}

/**
 *  * @author saibezaw
 * method name: findRestaurant
 * param:- rest (Restaurant)
 * returns :- rest(Restaurant)
 *
 */ 
	@Override
	public List<Restaurant> findByName(String name) {
		if(MenuController.logger.isDebugEnabled()){
			MenuController.logger.debug("findByName(Restaurant) is executed!");
			MenuController.logger.debug(" Name "+name+" searches the restaurant by the name");
		} 
		return menudao.findByName(name);
	}

/**
 *  * @author saibezaw
 * method name: showRestaurant
 * param:- rest (Restaurant)
 * returns :- rest(Restaurant)
 *
 */ 
	@Override
	public List<Restaurant> showRestaurant() {
		if(MenuController.logger.isDebugEnabled()){
			MenuController.logger.debug("showRestaurant(Restaurant) is executed!");
			MenuController.logger.debug("  shows the list of restaurants");
		}
		return menudao.findAll();
	}


}

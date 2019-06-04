package com.cg.myprojectspringboot.dto;
/**@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the Menu class which contains list of items
*/
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
public class Menu {
	@Id
	@Column(name ="menu_id")
	private int menuid;
	@Column(name ="menu_name")
	private String menuname;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="menu_id")
	private List <Item> itemName ;
	
	
	public int getMenuid() {
		return menuid;
	}
	public void setMenuid(int menuid) {
		this.menuid = menuid;
	}
	public String getMenuname() {
		return menuname;
	}
	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}
	public List<Item> getItemName() {
		return itemName;
	}
	public void setItemName(List<Item> itemName) {
		this.itemName = itemName;
	}
	public Menu(int menuid, String menuname, List<Item> itemName) {
		super();
		this.menuid = menuid;
		this.menuname = menuname;
		this.itemName = itemName;
	}
	public Menu() {
		super();
	}
public Menu(int menuid, String menuname) {
	super();
	this.menuid = menuid;
	this.menuname = menuname;
}
	
	
	/*@Override
	public String toString() {
		return "Menu [menuid=" + menuid + ", menuname=" + menuname + ", itemName=" + itemName + "]";
	}*/

	
}

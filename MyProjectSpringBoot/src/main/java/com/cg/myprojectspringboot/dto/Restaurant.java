
/**@Author saibezaw(176260)
 * 
* Project Name : Online Food Ordering System
* This is the  Restaurant  class where restaunt's properties are specified
*/package com.cg.myprojectspringboot.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Restaurant {
	@Id
	@Column(name="res_Phone")
private int phone;

	@Column(name="res_name")
	private String name;

	@Column(name="res_address")
private String address;
	@OneToOne(cascade= CascadeType.ALL)
	@JoinColumn(name ="menu_id")
private Menu menu;

public int getPhone() {
	return phone;
}
public void setPhone(int phone) {
	this.phone = phone;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Menu getMenu() {
	return menu;
}
public void setMenu(Menu menu) {
	this.menu = menu;
}
public Restaurant(int phone, String name, String address, Menu menu) {
	super();
	this.phone = phone;
	this.name = name;
	this.address = address;
	this.menu = menu;
}
public Restaurant() {
	super();
}
@Override
public String toString() {
	return "Restaurant [phone=" + phone + ", name=" + name + ", address=" + address + ", menu=" + menu + "]";
}

}

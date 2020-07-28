package com.example.ncr.pojos;

public class item {
   String name,price,quantity;

public item(String name, String price, String quantity) {
	super();
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}
   item(){
	   
   }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getQuantity() {
	return quantity;
}
public void setQuantity(String quantity) {
	this.quantity = quantity;
}
   
}

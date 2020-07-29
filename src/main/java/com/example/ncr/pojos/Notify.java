package com.example.ncr.pojos;

import java.util.List;

public class Notify {

	String item_name;
	Offers offer;
	
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public Offers getOffer() {
		return offer;
	}
	public void setOffer(Offers offer) {
		this.offer = offer;
	}
	public Notify(String item_name, Offers offer) {
		super();
		this.item_name = item_name;
		this.offer = offer;
	}
	public Notify() {
		// TODO Auto-generated constructor stub
	}
	

}

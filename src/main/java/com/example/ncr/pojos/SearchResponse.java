package com.example.ncr.pojos;

public class SearchResponse {
	String item_name;
	int loyalty_points;
	String location;
	Offers offer;
	public Offers getOffer() {
		return offer;
	}
	public void setOffer(Offers offer) {
		this.offer = offer;
	}
	public String getItem_name() {
		return item_name;
	}
	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}
	public int getLoyalty_points() {
		return loyalty_points;
	}
	public void setLoyalty_points(int loyalty_points) {
		this.loyalty_points = loyalty_points;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}	
}


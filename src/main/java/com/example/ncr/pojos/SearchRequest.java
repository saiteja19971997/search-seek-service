package com.example.ncr.pojos;

public class SearchRequest {
	String item_user;
	String city;
	String branch;
	public String getItem_user() {
		return item_user;
	}
	public void setItem_name(String item_user) {
		this.item_user = item_user;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}
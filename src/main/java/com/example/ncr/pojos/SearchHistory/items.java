package com.example.ncr.pojos.SearchHistory;

import java.util.List;

public class items {

	String branch,date;
	List<item> items;
	public items() {
		// TODO Auto-generated constructor stub
	}
	public items(String branch, String date, List<item> items) {
		super();
		this.branch = branch;
		this.date = date;
		this.items = items;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public List<item> getItems() {
		return items;
	}
	public void setItems(List<item> items) {
		this.items = items;
	}

}

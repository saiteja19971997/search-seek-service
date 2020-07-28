package com.example.ncr.pojos;

import java.util.List;

public class items {
   List<item> items;
   String branch,date;

   items(){
	   
   }

public items(List<item> items, String branch, String date) {
	super();
	this.items = items;
	this.branch = branch;
	this.date = date;
}

public List<item> getItems() {
	return items;
}

public void setItems(List<item> items) {
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

   
}

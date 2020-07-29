package com.example.ncr.pojos.SearchHistory;

public class item {
    Boolean buy;
    String item_name,suggestion;

	
    item(){
    	
    }


	public item(Boolean buy, String item_name, String suggestion) {
		super();
		this.buy = buy;
		this.item_name = item_name;
		this.suggestion = suggestion;
	}


	public Boolean getBuy() {
		return buy;
	}


	public void setBuy(Boolean buy) {
		this.buy = buy;
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getSuggestion() {
		return suggestion;
	}


	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
	
    
}

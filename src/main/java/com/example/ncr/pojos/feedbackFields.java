package com.example.ncr.pojos;


public class feedbackFields {
	String item_name,suggestion;
	boolean buy;
	
	public feedbackFields() {
		super();
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

	public boolean isBuy() {
		return buy;
	}

	public void setBuy(boolean buy) {
		this.buy = buy;
	}

	public feedbackFields(String item_name, String suggestion, boolean buy) {
		super();
		this.item_name = item_name;
		this.suggestion = suggestion;
		this.buy = buy;
	}
	
	
}

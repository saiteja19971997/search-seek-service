package com.example.ncr.pojos;

import java.util.List;

public class billHistory {
     List<items> billHistory;
     public billHistory(){
    	 
     }
	public billHistory(List<items> billHistory) {
		super();
		this.billHistory = billHistory;
	}
	public List<items> getBillHistory() {
		return billHistory;
	}
	public void setBillHistory(List<items> billHistory) {
		this.billHistory = billHistory;
	}
     
}

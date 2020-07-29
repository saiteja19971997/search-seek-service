package com.example.ncr.pojos.SearchHistory;

import java.util.List;

public class searchHistory {

	List<items> SearchHistory;
	String email,password,username;
	public searchHistory() {
		// TODO Auto-generated constructor stub
	}
	public searchHistory(List<items> searchHistory, String email, String password, String username) {
		super();
		SearchHistory = searchHistory;
		this.email = email;
		this.password = password;
		this.username = username;
	}
	public List<items> getSearchHistory() {
		return SearchHistory;
	}
	public void setSearchHistory(List<items> searchHistory) {
		SearchHistory = searchHistory;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}

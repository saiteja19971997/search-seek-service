package com.example.ncr.pojos;

public class Users {
   String email,password,username,loyalitypoints,mobile;

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}



public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public Users(String email, String password, String username, String loyalitypoints, String mobile) {
	super();
	this.email = email;
	this.password = password;
	this.username = username;
	this.loyalitypoints = loyalitypoints;
	this.mobile = mobile;
}

public void setPassword(String password) {
	this.password = password;
}

public String getUsername() {
	return username;
}

public Users() {
	super();
}

public void setUsername(String username) {
	this.username = username;
}

public String getLoyalitypoints() {
	return loyalitypoints;
}

public void setLoyalitypoints(String loyalitypoints) {
	this.loyalitypoints = loyalitypoints;
}


   
}

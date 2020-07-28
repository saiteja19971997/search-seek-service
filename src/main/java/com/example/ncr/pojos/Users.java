package com.example.ncr.pojos;

public class Users {
   String email,password,username;

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

public Users() {
	super();
}

public void setUsername(String username) {
	this.username = username;
}

public Users(String email, String password, String username) {
	super();
	this.email = email;
	this.password = password;
	this.username = username;
}
   
}

package com.example.ncr.pojos;


import java.util.List;

public class TheFeedback {
	
	List<feedbackFields> feedback;
	String date, branch;
	
	public List<feedbackFields> getFeedback() {
		return feedback;
	}
	public void setFeedback(List<feedbackFields> feedback) {
		this.feedback = feedback;
	}
	public TheFeedback(List<feedbackFields> feedback, String date, String branch) {
		super();
		this.feedback = feedback;
		this.date = date;
		this.branch = branch;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBranch() {
		return branch;
	}
	public TheFeedback(List<feedbackFields> feedback) {
		super();
		this.feedback = feedback;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}

}

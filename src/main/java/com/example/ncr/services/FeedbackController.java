package com.example.ncr.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ncr.DatabaseUtils.DatabaseUtils;
import com.example.ncr.pojos.TheFeedback;
import com.example.ncr.pojos.feedbackFields;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;


@RestController
public class FeedbackController {
	
	    List<feedbackFields> finalIntoDb=new ArrayList<feedbackFields>();
	
		@GetMapping(value = {"/feedback/{item}/{buy}", "/feedback/{item}/{buy}/{suggestion}"})  
		public void getFeedback(@PathVariable String item, @PathVariable boolean buy, @PathVariable(required = false) String suggestion) throws InterruptedException, ExecutionException
		{
			feedbackFields feedbackk=new feedbackFields(item,suggestion,buy);
			finalIntoDb.add(feedbackk);
		}	
		
		@PostMapping(value = "/done/{username}")
		public void storeFeedback(@RequestBody TheFeedback thefeedback, @PathVariable String username) throws InterruptedException, ExecutionException
		{
			thefeedback.setFeedback(finalIntoDb);
			
			DatabaseUtils dbu=new DatabaseUtils();
			Firestore db = dbu.intialise();
			ApiFuture<WriteResult> future = db.collection("Users").document(username).set(thefeedback);
			System.out.println("Update time : " + future.get().getUpdateTime());
		}			
}		
		
		
		
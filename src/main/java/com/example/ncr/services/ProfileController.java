package com.example.ncr.services;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ncr.DatabaseUtils.DatabaseUtils;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;

@RestController
public class ProfileController {
	
	@RequestMapping("/profile/{id}")
	public String getProfile(@PathVariable("id") String id) throws InterruptedException, ExecutionException {
		System.out.println(id);
		DatabaseUtils dbu=new DatabaseUtils();
		Firestore db = dbu.intialise();		
		DocumentReference docRef = db.collection("Users").document("9059886550");
		// asynchronously retrieve the document
		ApiFuture<DocumentSnapshot> future = docRef.get();
		// ...
		// future.get() blocks on response
		DocumentSnapshot document = future.get();
		if (document.exists()) {
		  System.out.println("Document data: " + document.getData());
		} else {
		  System.out.println("No such document!");
		}
		return "hi";
	}

}

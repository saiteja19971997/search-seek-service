package com.example.ncr.services;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ncr.DatabaseUtils.DatabaseUtils;
import com.example.ncr.pojos.Users;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;

@RestController
public class ProfileController {
	
	@RequestMapping("/profile/{id}")
	public Users getProfile(@PathVariable("id") String id) throws InterruptedException, ExecutionException {
		DatabaseUtils dbu=new DatabaseUtils();
		Users user = new Users();
		Firestore db = dbu.intialise();		
		DocumentReference docRef = db.collection("Users").document(id);
		// asynchronously retrieve the document
		ApiFuture<DocumentSnapshot> future = docRef.get();
		// ...
		// future.get() blocks on response
		DocumentSnapshot document = future.get();
		if (document.exists()) {
			user = document.toObject(Users.class);
		} else {
		  System.out.println("No such document!");
		}
		return user;
	}

}

package com.example.ncr.services;

import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ncr.DatabaseUtils.DatabaseUtils;
import com.example.ncr.pojos.Users;
import com.example.ncr.pojos.billHistory;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;

@RestController
public class BillHistoryController {

	@RequestMapping("/bills/{id}")
	public billHistory getBills(@PathVariable("id") String id) throws InterruptedException, ExecutionException {
		DatabaseUtils dbu=new DatabaseUtils();
		billHistory bh=new billHistory();
		Firestore db = dbu.intialise();		
		DocumentReference docRef = db.collection("bill history").document(id);
		// asynchronously retrieve the document
		ApiFuture<DocumentSnapshot> future = docRef.get();
		// ...
		// future.get() blocks on response
		DocumentSnapshot document = future.get();
		
		if (document.exists()) {
			bh = document.toObject(billHistory.class);
		} else {
		  System.out.println("No such document!");
		}
		return bh;
	}
}

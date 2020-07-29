package com.example.ncr.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ncr.DatabaseUtils.DatabaseUtils;
import com.example.ncr.pojos.Notify;
import com.example.ncr.pojos.Offers;
import com.example.ncr.pojos.SearchResponse;
import com.example.ncr.pojos.billHistory;
import com.example.ncr.pojos.SearchHistory.item;
import com.example.ncr.pojos.SearchHistory.items;
import com.example.ncr.pojos.SearchHistory.searchHistory;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;

@RestController
public class NotificationController {

	@RequestMapping("/notifications/{id}")
	public List<Notify> getNotifications(@PathVariable("id") String id) throws InterruptedException, ExecutionException {
		DatabaseUtils dbu=new DatabaseUtils();
		searchHistory sh=new searchHistory();
		SearchResponse sr=new SearchResponse();
		//Notifications n=new Notifications();
		List<Notify> lo=new ArrayList<Notify>();
		Firestore db = dbu.intialise();		
		DocumentReference docRef = db.collection("Users").document(id);
		// asynchronously retrieve the document
		ApiFuture<DocumentSnapshot> future = docRef.get();
		// ...
		// future.get() blocks on response
		DocumentSnapshot document = future.get();
		
		if (document.exists()) {
			sh = document.toObject(searchHistory.class);
		} else {
		  System.out.println("No such document!");
		}
		//processing
		HashMap<String,ArrayList> pro= new HashMap();
		ArrayList prev=new ArrayList();
		List<items> SearchHistory=sh.getSearchHistory();
		System.out.println(SearchHistory.size());
		for(items i : SearchHistory ) {
			List<item> j=i.getItems();
			System.out.println(j.size());
			String key= i.getBranch();
			System.out.println(key);
			if(pro.get(key)==null)
			{
				ArrayList ne = new ArrayList();
				pro.put(key, ne);
			}
			 prev=pro.get(key);
			 System.out.println(prev.size());
			for(item k : j) {
				prev.add(k.getItem_name());
			}
			pro.put(key, prev);
		}
		
		 for (Entry<String, ArrayList> entry : pro.entrySet()) 
		 {
	            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue()); 
	            String branch=entry.getKey();
	            ArrayList products=new ArrayList();
	            products=entry.getValue();
	            DatabaseUtils dbu1=new DatabaseUtils();
	    		Firestore db1 = dbu1.intialise();
	    		for(int i=0;i<products.size();i++) {
	    		DocumentReference docRef1 = db1.collection(branch).document((String) products.get(i));
	    		// asynchronously retrieve the document
	    		ApiFuture<DocumentSnapshot> future1 = docRef1.get();
	    		// ...
	    		// future.get() blocks on response
	    		DocumentSnapshot document1 = future1.get();
	    		
	    		if (document1.exists()) {
	    			System.out.println(document1.getData());
	    			sr = document1.toObject(SearchResponse.class);
	    			//lo.add(sr.getOffer());
	    			Notify not= new Notify();
	    			not.setItem_name(sr.getItem_name());
	    			not.setOffer(sr.getOffer());
	    			lo.add(not);
	    		} else {
	    		  System.out.println("No such document!");
	    		}
	    		}
	            
		 }
		return lo;
	}
}

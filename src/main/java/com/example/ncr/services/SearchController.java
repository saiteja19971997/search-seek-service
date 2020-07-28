package com.example.ncr.services;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ncr.DatabaseUtils.DatabaseUtils;
import com.example.ncr.pojos.SearchRequest;
import com.example.ncr.pojos.SearchResponse;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QuerySnapshot;



@RestController
public class SearchController {

	@GetMapping(value = "/search/{item}")
	public ArrayList<SearchResponse> getAllItems(@RequestBody SearchRequest searchrequest, @PathVariable String item) throws InterruptedException, ExecutionException
	{
		searchrequest.setItem_name(item);

		ArrayList<SearchResponse> searchresponse =new ArrayList<SearchResponse>();
		
		DatabaseUtils dbu=new DatabaseUtils();
		Firestore db = dbu.intialise();
		CollectionReference prod = db.collection(searchrequest.getBranch());
		Query query = prod.whereGreaterThanOrEqualTo("item_name", searchrequest.getItem_user().toLowerCase()).limit(3);
        ApiFuture<QuerySnapshot> querySnapshot = query.get();

		for (DocumentSnapshot document : querySnapshot.get().getDocuments()) {
			System.out.println(document.getId());
			searchresponse.add(document.toObject(SearchResponse.class));
		}
		return searchresponse;
	}
}
	
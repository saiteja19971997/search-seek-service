package com.example.ncr.DatabaseUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;

public class DatabaseUtils {
    public DatabaseUtils(){
    	
    }
    public Firestore intialise() {
    	FileInputStream serviceAccount = null;
		FirestoreOptions options=null;
		try {
			serviceAccount = new FileInputStream("SearchSeek.json");
		} 
		catch (FileNotFoundException e1) 
		{		
			e1.printStackTrace();
		}	
		try {			
			options = FirestoreOptions.newBuilder().setTimestampsInSnapshotsEnabled(true).
			setCredentials(GoogleCredentials.fromStream(serviceAccount)).
			setProjectId("searchseek-89066").build();
		}
		 catch (IOException e) 
		 {	
			e.printStackTrace();
		}		
	
		Firestore db = options.getService();
		return db;	
    }
}

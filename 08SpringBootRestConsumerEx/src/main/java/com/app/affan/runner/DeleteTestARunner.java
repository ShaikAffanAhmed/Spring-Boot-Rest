package com.app.affan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class DeleteTestARunner implements CommandLineRunner {

	public void run(String... args) throws Exception {
		//URL
		
		String url = "http://localhost:9090/v1/api/book/showF/{id}";
		
		// Body, Headers => RequestEntity
		// RestTemplate
		RestTemplate rt = new RestTemplate();
		
		// make call
		//rt.delete(url, 101);
		ResponseEntity<String> response = rt.exchange(url, HttpMethod.DELETE, null,String.class, 101);
		
		// print Response
		 System.out.println(response.getBody());
		 System.out.println(response.getHeaders());
	   //System.out.println(response.getStatusCode().name());
		 System.out.println(response.getStatusCode().value());
	}

}

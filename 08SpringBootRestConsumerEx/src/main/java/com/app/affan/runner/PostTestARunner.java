package com.app.affan.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

//@Component
public class PostTestARunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
	    //1.Create URL
		String url = "http://localhost:9090/v1/api/book/showD";
		
		//2. Create Request Headers
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
			
		//3. Create Request Body
		String body = "{\"bid\" : 101,\"bname\" : \"ABC\",\"bauth\" : \"AJ\",\"bcost\" : 500.0}";
		
		
		// 2+3 Combine Both Body and headers
		HttpEntity<String> requestEntity = new HttpEntity<>(body, headers);
		
		//4. Create RestTemplete object
		RestTemplate template = new RestTemplate();
		
		//5. Make HTTP call Get Response back
	    ResponseEntity<String> response = 
	    		//template.postForEntity(url, requEntity, String.class);
	    template.exchange(url, HttpMethod.POST, requestEntity, String.class);
	    				 
	 
	    //6. print details
	    System.out.println(response.getBody());
	    System.out.println(response.getHeaders());
	    //System.out.println(response.getStatusCode().name());
	    System.out.println(response.getStatusCode().value());
	   	
	}
}

package com.cts.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.beans.Login;

@Service
public class LoginService {
	
	public Login getUser() {
		return new Login("lalathi@gmail.com","lal@34");
		
	}
	public List<Object> getAllUsers(){
		String urlToHit="http://localhost:8082/info/all";
		return Arrays.asList(new RestTemplate().getForObject(urlToHit,Object[].class));
	}

}

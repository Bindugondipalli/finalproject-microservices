package com.cts.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.beans.Login;

@Service
public class LoginService {
	
	public Login getLogin() {
		
		return new Login("lalathi","lal@123");
		
	}
	public List<Object> getAllLogins(){
		String urlToHit="http://localhost:8083/info/all";
		return Arrays.asList(new RestTemplate().getForObject(urlToHit,Object[].class));
	}
	

}

package com.cts.resources;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.beans.Login;
import com.cts.service.LoginService;



@RestController
@RequestMapping("/info")
public class LoginController {
	
	@Autowired
	LoginService service;
	
	@RequestMapping("/login")
	Login getLogin() {
		return service.getLogin();
	}
	@RequestMapping("/all")
	List<Object> getAllLogins(){
		 return service.getAllLogins();
	}

}

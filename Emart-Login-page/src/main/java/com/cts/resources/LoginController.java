package com.cts.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.beans.Login;
import com.cts.service.LoginService;

@RestController
@RequestMapping("/Login")
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping("/user")
	Login getUser() {
		return service.getUser();
	}

	@RequestMapping("/all")
	List<Object> getAllLogins() {
		return service.getAllUsers();
	}

}

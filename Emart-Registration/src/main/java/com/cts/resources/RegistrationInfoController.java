package com.cts.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.beans.Registration;

@RestController
@RequestMapping("/info")
public class RegistrationInfoController {
	
	@RequestMapping("/all")
	List<Registration> getAllUsers(){
		return Arrays.asList(
			new Registration("lal","reddy","lal@gmail.com","la@1234","1234567890"),
			new Registration("lala","redday","laal@gmail.com","laa@1234","1134567890"),
			new Registration("lalu","reeeddy","lalll@gmail.com","laaa@1234","1236567890")
			
				
				);
				
	}

}

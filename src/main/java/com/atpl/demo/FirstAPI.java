package com.atpl.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPI {
	
	@GetMapping("/test") 
	public String test()   
	{  
	 
	return "Ok";  
	}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

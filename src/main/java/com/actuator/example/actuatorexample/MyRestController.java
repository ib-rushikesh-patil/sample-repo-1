package com.actuator.example.actuatorexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/users")
public class MyRestController {
	
	@RequestMapping("{id:[A-Za-z0-9]+}")
	public @ResponseBody String get(@PathVariable("id") String id) {
		//System.out.println("Here in Controller");
		System.out.println("Here in Controller " + id);
		return "Hellowrold ="+id;
	}
}

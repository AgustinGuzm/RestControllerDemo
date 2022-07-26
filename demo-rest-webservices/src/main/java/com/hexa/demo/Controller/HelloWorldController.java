package com.hexa.demo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.demo.Models.HelloWorldBeans;
import com.hexa.demo.Service.helloworldService;



@RestController
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String helloworld() {

		return helloworldService.gettexthelloWorld();
		
	}
	
	@GetMapping("/helloworld-bean")
	public HelloWorldBeans helloworldbean() {

		return helloworldService.gettexthelloWorldbean();
	}
	
	@GetMapping("/helloworld/pathVariable/{name}")
	public HelloWorldBeans helloworldpathVariablebean(@PathVariable String name) {

		return helloworldService.gettexthelloWorlPathVariabledbean(name);
	}
}

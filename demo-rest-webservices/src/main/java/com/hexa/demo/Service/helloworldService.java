package com.hexa.demo.Service;

import org.springframework.stereotype.Service;

import com.hexa.demo.Models.HelloWorldBeans;



@Service
public class helloworldService {

	public static String gettexthelloWorld() {

		return "Hello World";
	}
	
	public static HelloWorldBeans gettexthelloWorldbean() {
		return new HelloWorldBeans("Hello World Beans");
	}

	public static HelloWorldBeans gettexthelloWorlPathVariabledbean(String name) {
		
		return new HelloWorldBeans(String.format("Hello World Beans,  %s", name));
	}


}

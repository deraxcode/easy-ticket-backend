package cl.deraxcode.easyticket.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class HelloWorld {
	
	
	@GetMapping
	public String hello() {
		return "Hello World!";
	}

}

package cl.deraxcode.easyticket.backend.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@PreAuthorize("#oauth2.hasScope('read')")
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!";
	}

}

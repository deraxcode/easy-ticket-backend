package cl.deraxcode.easyticket.backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.deraxcode.easyticket.backend.domain.UserHost;
import cl.deraxcode.easyticket.backend.repository.UserHostRepository;

@RestController
public class UserHostController {
	
	@Autowired
	private UserHostRepository userHostRepository;
	
 	@GetMapping("/users")
	public List<UserHost> findAll() {
		return userHostRepository.findAll();
	}
	
	@PostMapping("/users")
	public UserHost save(@Valid UserHost userHost) {
		
		
		return userHostRepository.save(userHost);
	}
	

}

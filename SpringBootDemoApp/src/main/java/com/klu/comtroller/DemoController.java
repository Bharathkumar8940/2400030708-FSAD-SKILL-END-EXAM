package com.klu.comtroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/hello")
	public String sayHello() {
		return "this is spring boot demo application";
	}
	@GetMapping("/bye")
	public String sayBye() {
		return "Have a nice day";
	}
	
}

package org.anudip.bootGitApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	@GetMapping("/Hello")
	public String showHello() {
		return "Hello";	
	}
	@GetMapping("/Hi")
	public String showHi() {
		return "Hi";
	}
	

}

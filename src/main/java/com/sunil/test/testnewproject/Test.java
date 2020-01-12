package com.sunil.test.testnewproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/clientApp")
	public String hellotest() {
		System.out.println("Cient Site testing...");
		return "Tested Successfully.";
	}
}

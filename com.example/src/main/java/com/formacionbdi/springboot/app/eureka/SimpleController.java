package com.formacionbdi.springboot.app.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {
	
	@RequestMapping("/")
	public String index() {
		 return "Hello World";
	}

}

package com.codebarian.Application;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@RequestMapping("/codebarian/sayhello")
	public String greeting(){
		String reqEnt = "Hey buddy...! Hello :) ";
		return reqEnt;
	}
}

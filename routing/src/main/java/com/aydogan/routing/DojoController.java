package com.aydogan.routing;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("/m/{dojo}")
	public String dojo(@PathVariable("dojo") String dojo) {
		return dojo + " is awesome!";
	}
	
//	@RequestMapping("/m/{sanjose}")
//	public String san(@PathVariable("sanjose") String sanjose){
//		return sanjose + "is located in California";
//	}
}

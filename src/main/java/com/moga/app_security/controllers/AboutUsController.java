package com.moga.app_security.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/about_us")
public class AboutUsController {

	
	@GetMapping
	public Map<String,String> aboutUs(){
		return Collections.singletonMap("msj", "about_us");
	}
}

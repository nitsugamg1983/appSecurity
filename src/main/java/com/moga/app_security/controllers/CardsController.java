package com.moga.app_security.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/cards")
public class CardsController {

	
	@GetMapping
	public Map<String,String> cards(){
		return Collections.singletonMap("msj", "card");
	}
}

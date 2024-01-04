package com.moga.app_security.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/balance")
public class BalanceController {

	
	@GetMapping
	public Map<String,String> balance(){
		return Collections.singletonMap("msj", "balance");
	}
}

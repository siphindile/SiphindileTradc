package com.SiphindileTradClothing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/Login")
public class LoginController {

	@RequestMapping("/user")//post and get
	public ResponseEntity<?>  CheckLogin() {
		System.out.print("inside user...it is working");
		return ResponseEntity.ok("test");
	}
}

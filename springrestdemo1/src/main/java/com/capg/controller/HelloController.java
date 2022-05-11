package com.capg.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping(value="/hello")
	public String hello() {

}

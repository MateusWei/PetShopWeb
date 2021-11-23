package com.petshopweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// vai ser a primeira página

@Controller
public class MenuController {
	@RequestMapping("/")
	public String menu() {
		return "menu";
	}
}

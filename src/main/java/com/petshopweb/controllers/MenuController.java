package com.petshopweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// vai ser a primeira página

@Controller
public class MenuController {
	@RequestMapping("/")
	public String menu() {
		return "menu";
	}
	
	@RequestMapping(value="/criarPedido", method=RequestMethod.GET)
	public String criar() {
		return "criarPedido";
	}
	
	@RequestMapping(value="/listarPedidos", method=RequestMethod.GET)
	public String listarPedidos() {
		return "listarPedidos";
	}
	
	@RequestMapping(value="/menu", method=RequestMethod.GET)
	public String voltar() {
		return "menu";
	}
}

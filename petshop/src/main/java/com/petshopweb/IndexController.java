package com.petshopweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// classe de teste
// teste 1
// teste 2

@Controller
public class IndexController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}

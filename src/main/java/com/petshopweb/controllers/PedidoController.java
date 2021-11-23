package com.petshopweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.petshopweb.models.Pedido;
import com.petshopweb.repository.PedidoRepository;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoRepository ar;
	
	
	
	@RequestMapping(value="/criarPedido", method=RequestMethod.POST)
	public String criar(Pedido a) {
		ar.save(a);
		return "redirect:/menu";
	}
	
	@RequestMapping("/listarPedidos")
	public ModelAndView listaPedidos() {
		ModelAndView mv = new ModelAndView("menu");
		Iterable<Pedido> pedidos = ar.findAll();
		mv.addObject("pedidos", pedidos);
		return mv;
	}
}

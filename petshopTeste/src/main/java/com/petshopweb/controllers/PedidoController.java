package com.petshopweb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.petshopweb.models.Pedido;
import com.petshopweb.repository.PedidoRepository;

@Controller
public class PedidoController {
	
	@Autowired
	private PedidoRepository ar;
	
	@RequestMapping(value="/criarPedido", method=RequestMethod.GET)
	public String criar() {
		return "criarPedido";
	}
	
	@RequestMapping(value="/menu", method=RequestMethod.GET)
	public String voltar() {
		return "menu";
	}
	
	@RequestMapping(value="/criarPedido", method=RequestMethod.POST)
	public String criar(@Valid Pedido a, BindingResult result, RedirectAttributes attributes) {
		if(result.hasErrors()){
			attributes.addFlashAttribute("flashMessage", "Verifique os campos!");
			attributes.addFlashAttribute("flashType", "danger");
			return "redirect:/criarPedido";
		}
		
		ar.save(a);
		return "redirect:/menu";
	}
	
	@RequestMapping("/listarPedidos")
	public ModelAndView listaPedidos() {
		ModelAndView mv = new ModelAndView("listarPedidos");
		Iterable<Pedido> pedidos = ar.findAll();
		mv.addObject("pedidos", pedidos);
		return mv;
	}
	/*
	@RequestMapping("/{data}")
	public ModelAndView pedidosPorData(@PathVariable("data") LocalDate data) {
		ModelAndView mp = new ModelAndView("pedidosPorData");
		Iterable<Pedido> rep = ar.findAll();
		
		for(Pedido p : rep) {
			if(p.getData() == data) {
				Iterable<Pedido> pedidos = (Iterable<Pedido>) p;
			}
		}
		mp.addObject("pedidos", data);
		return mp;
	}
	*/
	@RequestMapping("/deletarPedido/{codigo}")
	public String deletarPedido(@PathVariable("codigo")long codigo) {
		Pedido pedido = ar.findByCodigo(codigo);
		ar.delete(pedido);
		return "redirect:/listarPedidos";
	}
	
}

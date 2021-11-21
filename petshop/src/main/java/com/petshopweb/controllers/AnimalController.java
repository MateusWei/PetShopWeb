package com.petshopweb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.petshopweb.models.Animal;
import com.petshopweb.repository.AnimalRepository;

@Controller
public class AnimalController {

	@Autowired
	private AnimalRepository ar;

	@RequestMapping(value = "/cadastrarAnimal", method = RequestMethod.GET)
	public String cadastrar() {

		return "cadastro/animal";
	}

	@RequestMapping(value = "/cadastrarAnimal", method = RequestMethod.POST)
	public String cadastrar(Animal a) {
		ar.save(a);
		return "redirect:/";
	}

	@RequestMapping("/animais")
	public ModelAndView listaAnimais() {
		ModelAndView mv = new ModelAndView("menu");
		Iterable<Animal> animais = ar.findAll();
		mv.addObject("animais", animais);
		return mv;
	}
}

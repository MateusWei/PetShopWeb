package com.petshopweb.controllers;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import com.petshopweb.models.Animal;

@Controller
public class AnimalController {
	
	private ArrayList<Animal> animais;
	
	public void cadastrar(Animal a) {
		this.animais.add(a);
		//ver como vai ser no banco de dados
		//colocar restrições
	}
	
	public void remover(Animal a) {
		this.animais.remove(a);
		//ver como vai ser no banco de dados
		//colocar restrições
	}
	
	public void editar(Animal a) {
		int indexUsuario = this.animais.indexOf(a);
		this.animais.set(indexUsuario, a);
		//ver como vai ser no banco de dados
		//colocar restrições
	}
}

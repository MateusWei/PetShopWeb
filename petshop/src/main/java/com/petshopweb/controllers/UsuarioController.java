package com.petshopweb.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;

import com.petshopweb.models.Usuario;

@Controller
public class UsuarioController {
	
	private ArrayList<Usuario> usuarios;
	
	public void cadastrar(Usuario u) {
		this.usuarios.add(u);
		//ver como vai ser no banco de dados
		//colocar restrições
	}
	
	public void remover(Usuario u) {
		this.usuarios.remove(u);
		//ver como vai ser no banco de dados
		//colocar restrições
	}
	
	public void editar(Usuario u) {
		int indexUsuario = this.usuarios.indexOf(u);
		this.usuarios.set(indexUsuario, u);
		//ver como vai ser no banco de dados
		//colocar restrições
	}
}

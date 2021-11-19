package com.petshopweb.models;

public class Usuario {
	
	private String nome;
	private String numero;
	private String email;
	private String senha;
	
	public Usuario(String nome, String numero, String email, String senha) {
		this.nome = nome;
		this.numero = numero;
		this.email = email;
		this.senha = senha;
	}
	
	@Override
	public boolean equals(Object usuario) {
		Usuario outro = (Usuario) usuario;
		if(this.email.equals(outro.email)) {
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}

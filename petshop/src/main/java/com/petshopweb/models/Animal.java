package com.petshopweb.models;

import com.petshopweb.models.enums.EnumSexo;
import com.petshopweb.models.enums.EnumTarefa;

public abstract class Animal {

	private String id;
	private int idade;
	private EnumSexo sexo;
	private String nome;
	private String emailResponsavel;
	private String descricao;
	private EnumTarefa tarefa;

	public Animal(String id, int idade, EnumSexo sexo, String nome, String emailResponsavel, String descricao, EnumTarefa tarefa) {
		this.id = id;
		this.idade = idade;
		this.sexo = sexo;
		this.nome = nome;
		this.emailResponsavel = emailResponsavel;
		this.descricao = descricao;
		this.tarefa = tarefa;
	}

	@Override
	public boolean equals(Object animal) {
		Animal outro = (Animal) animal;
		if(outro != null && this.getId().equals(outro.getId())){
			return true;
		}
		return false;
	}

	public String getId() {
		return id;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public EnumSexo getSexo() {
		return this.sexo;
	}

	public void setSexo(EnumSexo sexo) {
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmailResponsavel() {
		return emailResponsavel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}

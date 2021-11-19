package com.petshopweb.models;

import com.petshopweb.models.enums.EnumRacaGato;
import com.petshopweb.models.enums.EnumSexo;
import com.petshopweb.models.enums.EnumTarefa;

public class Gato extends Animal{
	private EnumRacaGato raca;

	public Gato(String id, int idade, EnumSexo sexo, String nome, String email, EnumRacaGato raca, String descricao, EnumTarefa tarefa) {
		super(id, idade, sexo, nome, email, descricao, tarefa);
		this.raca = raca;
	}
	
	public EnumRacaGato getRaca() {
		return raca;
	}
	
	public void setRaca(EnumRacaGato raca) {
		this.raca = raca;
	}
	
}
